package com.ky.lebron.controller;

import java.text.ParseException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ky.lebron.common.HuPuHttpcilentUtil;
import com.ky.lebron.domain.LbjContent;
import com.ky.lebron.service.LbjContentService;

@Controller
@RequestMapping("httpclient")
public class HuPuHttpController {

	private static final Logger log = LoggerFactory.getLogger(HuPuHttpController.class);
	
	@Autowired
	private LbjContentService lbjContentService;
	
	@RequestMapping("/news")
	public String getResult(){
		try {
			String url_prefix = "https://voice.hupu.com/nba/tag/3023-";
			for (int i = 1; i <= 2; i++) {
				String url = url_prefix+i+".html";
				String result = HuPuHttpcilentUtil.getHtmlString(url);
				//将结果进行封装
				parseResult(url, result);
			}	
				
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	/** 对结果进行封装 
	 * @throws ParseException */
	private void parseResult(String url, String result) throws ParseException {
		Document doc = Jsoup.parse(result);
		doc.setBaseUri(url);
		Elements as = doc.select(".list-content");
		for (Element a : as) {
			LbjContent newsContent = new LbjContent();
			newsContent.setIndexCategoryId(2l);
			for (Element a1 : a.children()) {
				if ("name".equals(a1.className())) {
					for (Element a2 : a1.children()) {
							for (Element a3 : a2.children()) {
								System.out.println(a3.attr("href"));//https://voice.hupu.com/nba/2300212.html
								System.out.println(a3.text());//巴克利向詹姆斯传话：你最好开始担心起来
								newsContent.setTitlePicture(a3.attr("href"));
								newsContent.setTitle(a3.text());
						}
					}
				}
			}
			for (Element a1 : a.children()) {
				if ("txt".equals(a1.className())) {
					for (Element a2 : a1.children()) {
						for (Element a3 : a2.children()) {
							for (Element a4 : a3.children()) {
								if("img".equals(a4.tagName())){
									System.out.println(a4.attr("src"));//https://c2.hoopchina.com.cn/uploads/star/event/images/180515/thumbnail-140c0f4f491ea2dfd48acb8e8dca490086a41194.png
									newsContent.setContentPicture((a4.attr("src")));
								}
							}
						}
					}
				}
			}
			for (Element a1 : a.children()) {
				if ("time".equals(a1.className())) {
					for (Element a2 : a1.children()) {
						System.out.println(a2.text());//1小时前
//						if(a2.text().sub)
						/*SimpleDateFormat sdf = new SimpleDateFormat("mm月dd日 hh:mm");
						newsContent.setCreateTime(sdf.parse(a2.text()));*/
					}
				}
			}
			int flag = lbjContentService.insertContent(newsContent);
			if(flag >1){
				log.info("插入数据成功！");
			}else{
				log.info("数据插入失败");
			}
		}
	}
	
}
