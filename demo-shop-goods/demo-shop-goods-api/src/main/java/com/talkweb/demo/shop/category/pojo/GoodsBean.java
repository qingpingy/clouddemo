package com.talkweb.demo.shop.category.pojo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;

/**
 *<p>Title:GoodsBean.java</p>
 *<p>Description:商品表 Bean(对应表名:shop_goods)</p>
 *@author Gavin
 *@version 1.0
 *@Automatically generate by Coder in 2020-07-08 00:12
 */
public class GoodsBean implements Serializable {
	private static final long serialVersionUID = 1L;
    private String goods_id;		//商品主键
    private String goods_name;		//商品名称
    private int price;		//价格，这里价格以简单的整形定义
    private String flag;		//是否上架标志
    private String brand;		//品牌
    private String goods_desc;		//商品描述
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",locale = "zh",timezone="GMT+8")
    private Date create_time;		//创建时间

	private String dis_count;	//是否打折

	/**
	*<b>Summary:设置商品主键</b>
	* setGoods_id
	* @param goods_id
	*/
    public void setGoods_id(String goods_id){
    	this.goods_id = goods_id;
    }
    /**
	*<b>Summary:获取商品主键</b>
	* getGoods_id
	* @return
	*/
    public String getGoods_id(){
    	return goods_id;
    }
    
	/**
	*<b>Summary:设置商品名称</b>
	* setGoods_name
	* @param goods_name
	*/
    public void setGoods_name(String goods_name){
    	this.goods_name = goods_name;
    }
    /**
	*<b>Summary:获取商品名称</b>
	* getGoods_name
	* @return
	*/
    public String getGoods_name(){
    	return goods_name;
    }
    
	/**
	*<b>Summary:设置价格，这里价格以简单的整形定义</b>
	* setPrice
	* @param price
	*/
    public void setPrice(int price){
    	this.price = price;
    }
    /**
	*<b>Summary:获取价格，这里价格以简单的整形定义</b>
	* getPrice
	* @return
	*/
    public int getPrice(){
    	return price;
    }
    
	/**
	*<b>Summary:设置是否上架标志</b>
	* setFlag
	* @param flag
	*/
    public void setFlag(String flag){
    	this.flag = flag;
    }
    /**
	*<b>Summary:获取是否上架标志</b>
	* getFlag
	* @return
	*/
    public String getFlag(){
    	return flag;
    }
    
	/**
	*<b>Summary:设置品牌</b>
	* setBrand
	* @param brand
	*/
    public void setBrand(String brand){
    	this.brand = brand;
    }
    /**
	*<b>Summary:获取品牌</b>
	* getBrand
	* @return
	*/
    public String getBrand(){
    	return brand;
    }
    
	/**
	*<b>Summary:设置商品描述</b>
	* setGoods_desc
	* @param goods_desc
	*/
    public void setGoods_desc(String goods_desc){
    	this.goods_desc = goods_desc;
    }
    /**
	*<b>Summary:获取商品描述</b>
	* getGoods_desc
	* @return
	*/
    public String getGoods_desc(){
    	return goods_desc;
    }
    
	/**
	*<b>Summary:设置创建时间</b>
	* setCreate_time
	* @param create_time
	*/
    public void setCreate_time(Date create_time){
    	this.create_time = create_time;
    }
    /**
	*<b>Summary:获取创建时间</b>
	* getCreate_time
	* @return
	*/
    public Date getCreate_time(){
    	return create_time;
    }

	public String getDis_count() {
		return dis_count;
	}

	public void setDis_count(String dis_count) {
		this.dis_count = dis_count;
	}
}