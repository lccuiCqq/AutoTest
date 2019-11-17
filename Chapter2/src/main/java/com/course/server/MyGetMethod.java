package com.course.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


@RestController
public class MyGetMethod {
    /**
     * 请求应答返回cookie信息
     */
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public  String cookies(HttpServletResponse response){
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜获得cookies";
    }

    /**
     * 要求客户端携带cookie才能访问
     * 需要携带cookie才能访问的get请求
     */
    @RequestMapping(value = "/getWithCookies",method = RequestMethod.GET)
    public String getWithCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "必须携带cookies";
        }
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "恭喜访问成功-";
            }
        }
        return "这是一个携带cookie访问成功";
    }
}
