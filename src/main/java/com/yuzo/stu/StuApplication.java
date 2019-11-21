package com.yuzo.stu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class StuApplication {

    @RequestMapping("/")
    public String index(){
        return "main";
    }



    public static void main(String[] args) {
        SpringApplication.run(StuApplication.class, args);
    }

}
