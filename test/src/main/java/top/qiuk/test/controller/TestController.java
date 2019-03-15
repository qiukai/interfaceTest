package top.qiuk.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServlet;

@RestController
@Controller
public class TestController {


    @RequestMapping(value = "/")
    @ResponseBody
    public void aa(HttpServlet httpServlet){

        WebApplicationContextUtils.getWebApplicationContext(httpServlet.getServletContext());

    }

}
