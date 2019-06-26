package cn.kgc.app.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("getDate")
    @ResponseBody
    public  String getDate(@RequestParam("date") Date date){
        return date.toString();
    }

    @RequestMapping("tz")
    public  ModelAndView xg(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("devlogin");
        return modelAndView;
    }
}
