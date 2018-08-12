package com.co.auction.entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 商品信息Entity
 * @author TTH
 * Date 2018/8/2
 */
public class GoodsInfoEntity {
	//商品ID	
	private String goodsId;
	//商品名称
	private String goodsName;
	//名称拼音
	private String goodsPinyin;
	//生产日期
	private Date productDate;
	//生产地
	private String productLacation;
	//生产者
	private String producer;
	//原始价格
	private Double originalPrice;
	//拍卖价格
	private Double saleOriginalPrice;
	//是否已拍卖
	private String isSold;
	//登录时间
	private Timestamp insertDatetime;
	//登录者
	private String insertName;
	//修改时间
	private Timestamp updateDatetime;
	//修改者
	private String updateName;
	
	
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsPinyin() {
		return goodsPinyin;
	}
	public void setGoodsPinyin(String goodsPinyin) {
		this.goodsPinyin = goodsPinyin;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public String getProductLacation() {
		return productLacation;
	}
	public void setProductLacation(String productLacation) {
		this.productLacation = productLacation;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public Double getSaleOriginalPrice() {
		return saleOriginalPrice;
	}
	public void setSaleOriginalPrice(Double saleOriginalPrice) {
		this.saleOriginalPrice = saleOriginalPrice;
	}
	public String getIsSold() {
		return isSold;
	}
	public void setIsSold(String isSold) {
		this.isSold = isSold;
	}
	public Timestamp getInsertDatetime() {
		return insertDatetime;
	}
	public void setInsertDatetime(Timestamp insertDatetime) {
		this.insertDatetime = insertDatetime;
	}
	public String getInsertName() {
		return insertName;
	}
	public void setInsertName(String insertName) {
		this.insertName = insertName;
	}
	public Timestamp getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	
}
