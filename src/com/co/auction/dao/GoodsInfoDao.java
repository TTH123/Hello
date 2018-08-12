package com.co.auction.dao;

import java.util.List;

import com.co.auction.entity.GoodsInfoEntity;

public interface GoodsInfoDao {
	// 查询全部商品
	public List<GoodsInfoEntity> findAll(); 
	// 根据商品ID查询
	public List<GoodsInfoEntity> findById(String goodsId); 
	// 更新商品信息
	public int update(GoodsInfoEntity entity);
}
