package com.scoprion.mall.backstage.controller;

import com.scoprion.mall.backstage.service.shop.ShopService;
import com.scoprion.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by hmy
 * @created on 2017/12/11/011.
 */
@RequestMapping("/shop")
@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;


    /**
     * 商铺列表
     * @param pageNo
     * @param pageSize
     * @param audit
     * @return
     */
    @GetMapping("/listPage")
    public PageResult listPage(Integer pageNo,Integer pageSize,String audit){
        return shopService.listPage(pageNo,pageSize,audit);
    }
}
