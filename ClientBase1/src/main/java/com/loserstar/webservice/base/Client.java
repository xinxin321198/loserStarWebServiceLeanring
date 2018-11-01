/**
 * author: loserStar
 * date: 2018年11月1日下午4:36:01
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package com.loserstar.webservice.base;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * author: loserStar
 * date: 2018年11月1日下午4:36:01
 * remarks:
 */
public class Client {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8888/loser?wsdl");
		QName qName = new QName("http://base.webservice.loserstar.com/", "TestServiceImpService");
		Service service =  Service.create(url, qName);
		TestService testService = service.getPort(TestService.class);
		String testStr = testService.add("这是手写的WebService客户端");
		System.out.println(testStr);
	}

}
