package com.ky.lebron.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 爬取虎扑骑士新闻的工具类
 * @author Luyong
 */
public class HuPuHttpcilentUtil {

	private static final Logger log = LoggerFactory.getLogger(HuPuHttpcilentUtil.class);
	
	/** 获取页面的信息*/
	public static String getHtmlString(String url) throws UnsupportedOperationException, IOException {

		HttpClient client = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse httpRespr = (CloseableHttpResponse) client.execute(httpget);
		// log.info("请求返回的响应结果：" + httpRespr);

		InputStream is = httpRespr.getEntity().getContent();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i = -1;
		while ((i = is.read()) != -1) {
			baos.write(i);
		}
		String result = baos.toString("utf-8");
		// log.info("流读取的结果：" + result);
		return result;
	}

	
	
	public static void main(String[] args) throws UnsupportedOperationException, IOException {
		String url = "https://voice.hupu.com/nba/tag/3023-1.html";
		String result = getHtmlString(url);
		Document doc = Jsoup.parse(result);
		doc.setBaseUri(url);
		// Elements as =
		// doc.select(NovelSpiderUtil.getContext(NovelSiteEnum.getEnumByUrl(url)).get("chapter-list-selector"));
		Elements as = doc.select(".list-content");

		for (Element a : as) {
			for (Element a1 : a.children()) {
				if ("name".equals(a1.className())) {
					for (Element a2 : a1.children()) {
							for (Element a3 : a2.children()) {
								System.out.println(a3.attr("href"));//https://voice.hupu.com/nba/2300212.html
								System.out.println(a3.text());//巴克利向詹姆斯传话：你最好开始担心起来
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
					}
				}
			}
		}
	}
	
}
