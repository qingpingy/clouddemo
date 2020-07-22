package com.talkweb.demo.shop.category.controller;

import com.talkweb.demo.shop.category.api.IGoodsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import io.swagger.annotations.*;
import com.talkweb.pangu.base.common.pojo.PageBean;
import com.talkweb.pangu.base.common.result.AResultCode;
import com.talkweb.pangu.base.common.result.ResultMap;
import com.talkweb.demo.shop.category.pojo.GoodsBean;
import com.talkweb.demo.shop.category.service.GoodsService;

/**
 *<p>Title:GoodsController.java</p>
 *<p>Description:商品表 Action</p>
 *@author Gavin
 *@version 1.0
 *@Automatically generate by Coder in 2020-07-08 00:12
 */
@RestController
@RequestMapping(name="商品表", value="/goods/")
@Api(tags = {"商品表 Api 接口文档"})
public class GoodsController implements IGoodsApi {
	private static final Logger log = LoggerFactory.getLogger(GoodsController.class);
	@Autowired
	private GoodsService goodsService;

	@ApiOperation(value="新增接口")
	@Transactional
	@RequestMapping(name="新增接口",value="insert.json",method = RequestMethod.POST)
	public ResultMap<AResultCode, GoodsBean> insert(@ApiParam(value = "对象数据", required = true) @RequestBody GoodsBean bean){
		return goodsService.insert(bean);
	}

	@ApiOperation(value="修改接口")
	@Transactional
	@RequestMapping(name="修改接口",value="update.json",method = RequestMethod.POST)
	public ResultMap<AResultCode, GoodsBean> update(@ApiParam(value = "对象数据", required = true) @RequestBody GoodsBean bean){
		return goodsService.update(bean);
	}

	@ApiOperation(value="删除接口")
	@ApiImplicitParam(name = "goods_id", value = "主键ID", required = true, paramType = "query")
	@RequestMapping(name="删除接口",value="delete.json",method = RequestMethod.GET)
	@Transactional
	public ResultMap<AResultCode, GoodsBean> delete(@RequestParam("goods_id") String goods_id){
		return goodsService.delete(goods_id);
	}

	@ApiOperation(value="分页查询列表接口")
	@RequestMapping(name="分页查询列表接口",value="pageList.json",method = RequestMethod.POST)
	public ResultMap<AResultCode, PageBean<GoodsBean>> pageList(@ApiParam(value = "分页对象数据", required = true) @RequestBody PageBean<GoodsBean> pb){
		pb.init(pb,GoodsBean.class);	//需要调用init，将页面传来的json条件转换为bean
		return goodsService.pageList(pb);
	}

	@ApiOperation(value="查询所有数据接口")
	@RequestMapping(name="查询所有数据接口",value="list.json",method = RequestMethod.POST)
	public ResultMap<AResultCode, List<GoodsBean>> list(@ApiParam(value = "对象数据", required = true) @RequestBody(required = false) GoodsBean bean){
		return goodsService.list(bean);
	}

	@Override
	@ApiOperation(value="根据主键获取数据接口")
	@ApiImplicitParam(name = "goods_id", value = "主键ID", required = true, paramType = "query")
	public ResultMap<AResultCode, GoodsBean> get(String goods_id){
		return goodsService.get(goods_id);
	}
	
}