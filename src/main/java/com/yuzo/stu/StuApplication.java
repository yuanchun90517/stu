package com.yuzo.stu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@MapperScan("com.yuzo.stu.mapper")
@Controller
@SpringBootApplication
public class StuApplication {

    @RequestMapping("/")
    public String index(){
        return "main";
    }

    @RequestMapping("/info")
    public String info(){
        return "info";
    }

    public static void main(String[] args) {
        SpringApplication.run(StuApplication.class, args);
    }

}
