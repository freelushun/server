package com.free.wordbookserver;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.free")
@MapperScan("com.free.wordbookserver.mapper")
public class WordbookserverApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WordbookserverApplication.class);

    public static void main(String[] args) {
        SpringApplication app =new SpringApplication(WordbookserverApplication.class);
        Environment environment = app.run(args).getEnvironment() ;
        LOG.info("启动成功");
        LOG.info("WordbookSever地址:\t http://127.0.0.1:{}",environment.getProperty("server.port"));


    }

}
