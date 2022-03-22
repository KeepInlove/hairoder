package com.gxy.hairorder.controller;

import com.gxy.hairorder.req.CartReq;
import com.gxy.hairorder.resp.CartResp;
import com.gxy.hairorder.resp.CommonResp;
import com.gxy.hairorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/3/22 20:03
 * @Classname CarController
 * @Description TODO
 */
@RestController
@RequestMapping("/cart")
public class CarController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public CommonResp add(@Valid @RequestBody CartReq cartReq){
        CommonResp commonResp=new CommonResp();
        cartService.save(cartReq);
        return commonResp;
    }

    @GetMapping("/findUserId/{userId}")
    public CommonResp findByUserId(@PathVariable Long userId){
        CommonResp commonResp=new CommonResp();
        List<CartResp> cartRespList = cartService.findByUserId(userId);
        commonResp.setContent(cartRespList);
        return commonResp;
    }
}