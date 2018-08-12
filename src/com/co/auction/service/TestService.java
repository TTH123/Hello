package com.co.auction.service;

import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.co.auction.dao.GoodsInfoDao;
import com.co.auction.entity.GoodsInfoEntity;

public class TestService {
	
	/**
	 * 查询所有商品
	 * @return 所有商品
	 */
	public List<GoodsInfoEntity> getAll(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsInfoDao dao = ctx.getBean(GoodsInfoDao.class);
		
		List<GoodsInfoEntity> list = dao.findAll();
		
		return list;
	}
	
	/**
	 * 生成随机数
	 * @return 0到10的随机数
	 */
	public int getRandom(){
		Random r = new Random();
		//生成0到10的随机数
		int random = r.nextInt(10);
		return random;
	}
}
