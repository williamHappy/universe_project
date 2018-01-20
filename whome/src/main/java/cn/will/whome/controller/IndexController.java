package cn.will.whome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc:
 * Author: will
 * Date: 18:19 2018/1/19
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index_me";
    }
}