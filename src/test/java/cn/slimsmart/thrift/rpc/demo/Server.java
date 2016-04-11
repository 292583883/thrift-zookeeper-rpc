package cn.slimsmart.thrift.rpc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务端演示代码
 * 	使用spring xml配置文件的方式启动
 */
public class Server {

	public static void main(String[] args) {
		try {
			new ClassPathXmlApplicationContext("classpath:spring-context-thrift-server.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
