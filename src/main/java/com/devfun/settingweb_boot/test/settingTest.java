package com.devfun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.devfun.settingweb_boot.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class settingTest {

    @Autowired
    private StatisticService service;

    @ResponseBody
    @GetMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{

        return service.yearloginNum(year);
    }

    @GetMapping("/test")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "devfunpj");
        List<String> resultList = new ArrayList<String>();
        resultList.add("!!!HELLO WORLD!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!!!");
        resultList.add("설정 TEST!!!!!!");
        mav.addObject("list", resultList);
        return mav;
    }

}