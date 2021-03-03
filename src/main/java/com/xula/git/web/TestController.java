package com.xula.git.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @email: xuliandream@gmail.com
 * @author: xula
 * @date: 2021/3/2
 * @time: 10:49
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/file")
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getResource());
        String name = request.getParameter("name");
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/hello")
    public void test() {
        System.out.println("hello world");
    }
}
