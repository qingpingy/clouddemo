package com.talkweb.demo.shop.category.dao;

import com.talkweb.demo.shop.category.pojo.GoodsBean;
import com.talkweb.pangu.base.common.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 *<p>Title:GoodsMapper.java</p>
 *<p>Description:商品表Dao</p>
 *@author Gavin
 *@version 1.0
 *@Automatically generate by Coder in 2020-07-08 00:12
 */
@Mapper
 public interface GoodsMapper {
	/**
    *<b>Summary: 选择性的保存数据</b>
    * insertSelective
    * @param bean
    */
	public void insertSelective(GoodsBean bean);

	/**
    *<b>Summary: 选择性的更新数据</b>
    * updateSelective
    * @param bean
    */
	public void updateSelective(GoodsBean bean);

	/**
    *<b>Summary: 删除数据</b>
    * delete
    * @param ids
    */
	public void delete(String[] ids);

	/**
    *<b>Summary: 分页查询数据</b>
    * pageList
    * @param pb
    * @return
    */
	public List<GoodsBean> pageList(PageBean<GoodsBean> pb);

	/**
    *<b>Summary: 普通查询</b>
    * list
    * @param bean
    */
	public List<GoodsBean> list(GoodsBean bean);

	/**
    *<b>Summary: 根据Id查询数据</b>
    * get
    * @param goods_id
    */
	public GoodsBean get(String goods_id);

 }