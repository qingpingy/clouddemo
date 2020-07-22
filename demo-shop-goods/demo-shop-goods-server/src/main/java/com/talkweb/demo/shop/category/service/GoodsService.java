package com.talkweb.demo.shop.category.service;

import java.util.List;
import com.talkweb.pangu.base.common.pojo.PageBean;
import com.talkweb.pangu.base.common.result.AResultCode;
import com.talkweb.pangu.base.common.result.ResultMap;
import com.talkweb.demo.shop.category.pojo.GoodsBean;

/**
 *<p>Title:GoodsService.java</p>
 *<p>Description:商品表Service</p>
 *@author Gavin
 *@version 1.0
 *@Automatically generate by Coder in 2020-07-08 00:12
 */
public interface GoodsService{
    /**
	*<b>Summary: 保存数据</b>
	* insert
	* @param bean
	* @return
	*/
	public ResultMap<AResultCode, GoodsBean> insert(GoodsBean bean);

	/**
    *<b>Summary: 更新数据</b>
    * update
    * @param bean
	* @return
    */
	public ResultMap<AResultCode, GoodsBean> update(GoodsBean bean);

	/**
    *<b>Summary: 删除数据</b>
    * delete
    * @param goods_id
	* @return
    */
	public ResultMap<AResultCode, GoodsBean> delete(String goods_id);

	/**
    *<b>Summary: 分页查询列表数据</b>
    * pageList
    * @param pb
	* @return
    */
	public ResultMap<AResultCode, PageBean<GoodsBean>> pageList(PageBean<GoodsBean> pb);

	/**
    *<b>Summary: 查询列表数据</b>
    * list
    * @param bean
	* @return
    */
	public ResultMap<AResultCode, List<GoodsBean>> list(GoodsBean bean);

	/**
    *<b>Summary: 根据Id查询数据</b>
    * get
    * @param goods_id
	* @return
    */
	public ResultMap<AResultCode, GoodsBean> get(String goods_id);

}