package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 测试使用的controller，查询当前的时间
 */
@Controller
public class TestController {

   @Autowired
   @Qualifier("testService")
   private TestService testService;

    @RequestMapping("/test/queryNow")
    public String queryNow(Model model){
        //1、引入服务
        //2、诸如服务
        //3、调用服务方法
        String time = testService.queryNow();
        model.addAttribute("time",time);
        return "success";
    }
}
