package com.co.auction.service;

import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.co.auction.dao.GoodsInfoDao;
import com.co.auction.entity.GoodsInfoEntity;

public class TestService {
	
	/**
	 * ��ѯ������Ʒ
	 * @return ������Ʒ
	 */
	public List<GoodsInfoEntity> getAll(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsInfoDao dao = ctx.getBean(GoodsInfoDao.class);
		
		List<GoodsInfoEntity> list = dao.findAll();
		
		return list;
	}
	
	/**
	 * ���������
	 * @return 0��10�������
	 */
	public int getRandom(){
		Random r = new Random();
		//����0��10�������
		int random = r.nextInt(10);
		return random;
	}
}
