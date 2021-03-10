package cn.tedu.springboot2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用于标注用于处理浏览器请求的类
 */
@Controller
@Slf4j
public class DemoController {
    /**
     * @RequestMapping 注解用于声明 当前方法处理那个浏览器请求
     * 当浏览器请求 http://localhost:8080/test时
     * 执行test（）方法
     * @ResponseBody 将方法的返回值填充响应消息的Body(正文)
     * 响应正文信息会发送到浏览器中显示出来
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        //控制台上显示
        log.debug("Hello World!");
        return "Hello World!";
    }
}
