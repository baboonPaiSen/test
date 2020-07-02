package com.gsk;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.gsk.mybatis.mapper")
public class Application {



    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }




}
