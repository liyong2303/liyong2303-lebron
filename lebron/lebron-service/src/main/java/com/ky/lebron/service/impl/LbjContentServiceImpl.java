package com.ky.lebron.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ky.lebron.dao.LbjContentMapper;
import com.ky.lebron.domain.LbjContent;
import com.ky.lebron.service.LbjContentService;

@Service
public class LbjContentServiceImpl implements LbjContentService {

	@Autowired
	private LbjContentMapper lbjContentMapper;
	
	@Override
	public int insertContent(LbjContent lbjContent) {
		int insert = lbjContentMapper.insertSelective(lbjContent);
		return insert;
	}

}
