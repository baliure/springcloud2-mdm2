package cn.dazd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("cn.dazd.api.persistence.mybatis")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class Application extends BaseApplication{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
