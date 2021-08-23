package cn.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("cn.baizhi.dao")
public class VueAxiosSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueAxiosSpringbootApplication.class, args);
    }

}
