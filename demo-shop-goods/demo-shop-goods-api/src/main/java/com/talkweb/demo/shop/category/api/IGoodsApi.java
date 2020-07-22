package com.talkweb.demo.shop.category.api;

import com.talkweb.demo.shop.category.pojo.GoodsBean;
import com.talkweb.pangu.base.common.result.AResultCode;
import com.talkweb.pangu.base.common.result.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商品服务对外接口
 */
public interface IGoodsApi {

    @RequestMapping(name="根据主键获取数据接口",value="get.json",method = RequestMethod.GET)
    ResultMap<AResultCode, GoodsBean> get(@RequestParam("goods_id") String goods_id);

}
