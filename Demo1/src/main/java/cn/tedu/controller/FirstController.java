package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wuh
 * @Created by wuh on 2018/6/24.
 */
@Controller
public class FirstController {
    @RequestMapping(value = "first.do",method = RequestMethod.GET)
    public void firstMethod(HttpServletResponse response) throws IOException {
        System.out.println("firstMethod");
        response.getWriter().write("hello spring mvc");
    }
}
