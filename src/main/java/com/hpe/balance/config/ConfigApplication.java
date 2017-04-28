package com.hpe.balance.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/** 
 * @ClassName: ConfigApplication 
 * @Description: Config server 启动类
 * @company HPE  
 * @author lilei   
 * @date 2017年4月14日 上午10:43:28 
 *  http://localhost:8080/refresh  刷新配置
 *  http://localhost:8080/restart  加载配置
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
