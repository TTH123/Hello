package com.co.auction.entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * ��Ʒ��ϢEntity
 * @author TTH
 * Date 2018/8/2
 */
public class GoodsInfoEntity {
	//��ƷID	
	private String goodsId;
	//��Ʒ����
	private String goodsName;
	//����ƴ��
	private String goodsPinyin;
	//��������
	private Date productDate;
	//������
	private String productLacation;
	//������
	private String producer;
	//ԭʼ�۸�
	private Double originalPrice;
	//�����۸�
	private Double saleOriginalPrice;
	//�Ƿ�������
	private String isSold;
	//��¼ʱ��
	private Timestamp insertDatetime;
	//��¼��
	private String insertName;
	//�޸�ʱ��
	private Timestamp updateDatetime;
	//�޸���
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
