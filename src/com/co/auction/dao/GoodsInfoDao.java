package com.co.auction.dao;

import java.util.List;

import com.co.auction.entity.GoodsInfoEntity;

public interface GoodsInfoDao {
	// ��ѯȫ����Ʒ
	public List<GoodsInfoEntity> findAll(); 
	// ������ƷID��ѯ
	public List<GoodsInfoEntity> findById(String goodsId); 
	// ������Ʒ��Ϣ
	public int update(GoodsInfoEntity entity);
}
