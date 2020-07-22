package com.talkweb.demo.shop.category.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import com.talkweb.demo.shop.category.dao.GoodsMapper;
import com.talkweb.demo.shop.category.pojo.GoodsBean;
import com.talkweb.demo.shop.category.service.GoodsService;
import com.talkweb.pangu.base.common.pojo.PageBean;
import com.talkweb.pangu.base.common.result.AResultCode;
import com.talkweb.pangu.base.common.result.ResultMap;
import com.talkweb.pangu.base.common.util.StringUtil;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *<p>Title:GoodsServiceImpl.java</p>
 *<p>Description:商品表ServiceImpl</p>
 *@author Gavin
 *@version 1.0
 *@Automatically generate by Coder in 2020-07-08 00:12
 */
@Service
@RefreshScope
public class GoodsServiceImpl implements GoodsService{
	private static final Logger log = LoggerFactory.getLogger(GoodsServiceImpl.class);
	@Autowired
	private GoodsMapper goodsMapper;
	@Value("${shop.goods.dis_count}")
	private String dis_count;
	
	@Override
	public ResultMap<AResultCode, GoodsBean> insert(GoodsBean bean){
		ResultMap<AResultCode, GoodsBean> result = new ResultMap<AResultCode, GoodsBean>();
		if(StringUtil.isNull(bean)){
			result.setCode(AResultCode.IS_NULL);
		} else {
			if(StringUtil.isNull(bean.getGoods_id())){
				bean.setGoods_id(StringUtil.getUUID());
			}
			goodsMapper.insertSelective(bean);	
			result.setCode(AResultCode.OK);
			result.setResult(bean);
		}
		return result;
	}

	
	@Override
	public ResultMap<AResultCode, GoodsBean> update(GoodsBean bean){
		ResultMap<AResultCode, GoodsBean> result = new ResultMap<AResultCode, GoodsBean>();

		if(StringUtil.isNull(bean)){
			result.setCode(AResultCode.IS_NULL);
		} else if(StringUtil.isNull(bean.getGoods_id())){
			result.setCode(AResultCode.MISS_ID);
		} else {
			goodsMapper.updateSelective(bean);	
			result.setCode(AResultCode.OK);
			result.setResult(bean);
		}

		return result;
	}

	
	@Override
	public ResultMap<AResultCode, GoodsBean> delete(String goods_id){
		ResultMap<AResultCode, GoodsBean> result = new ResultMap<AResultCode, GoodsBean>();

		if(StringUtil.isNull(goods_id)){
			result.setCode(AResultCode.MISS_ID);
		} else {
			String[] ids = goods_id.split(",");
			goodsMapper.delete(ids);
			result.setCode(AResultCode.OK);
		}

		return result;
	}

	
	@Override
	public ResultMap<AResultCode, PageBean<GoodsBean>> pageList(PageBean<GoodsBean> pb){
		ResultMap<AResultCode, PageBean<GoodsBean>> result = new ResultMap<AResultCode, PageBean<GoodsBean>>();

		pb.setData(goodsMapper.pageList(pb));
		pb.clear();

		result.setCode(AResultCode.OK);
		result.setResult(pb);

		return result;
	}

	
	@Override
	public ResultMap<AResultCode, List<GoodsBean>> list(GoodsBean bean){
		ResultMap<AResultCode, List<GoodsBean>> result = new ResultMap<AResultCode, List<GoodsBean>>();

		List<GoodsBean> list = goodsMapper.list(bean);
		result.setCode(AResultCode.OK);
		result.setResult(list);

		return result;
	}

	
	@Override
	public ResultMap<AResultCode, GoodsBean> get(String goods_id){
		ResultMap<AResultCode, GoodsBean> result = new ResultMap<AResultCode, GoodsBean>();

		if(StringUtil.isNull(goods_id)){
			return result.setCode(AResultCode.MISS_ID);
		}

		GoodsBean bean = goodsMapper.get(goods_id);

		if(bean == null) {
			return result.setCode(AResultCode.UNEXIST);
		}

		result.setCode(AResultCode.OK);
		bean.setDis_count(dis_count);
		result.setResult(bean);

		return result;
	}

	
}