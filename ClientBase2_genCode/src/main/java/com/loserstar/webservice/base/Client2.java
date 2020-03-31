/**
 * author: loserStar
 * date: 2018年11月1日下午9:19:27
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package com.loserstar.webservice.base;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * author: loserStar
 * date: 2018年11月1日下午9:19:27
 * remarks:
 */
public class Client2 {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8880/loser?wsdl");
		TestServiceImpService testServiceImpService = new TestServiceImpService(url);
		TestService testService = testServiceImpService.getTestServiceImpPort();
		System.out.println(testService.add("这是使用wsimport命令生成的客户端"));
	}

}
