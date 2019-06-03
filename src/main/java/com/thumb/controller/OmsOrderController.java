package com.thumb.controller;


import com.thumb.entity.pojo.OmsOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OmsOrderController {



    @ResponseBody
    @RequestMapping("listAllOmsOrder")
    public OmsOrder listAllOmsOrder() {

        return null;
    }

}
