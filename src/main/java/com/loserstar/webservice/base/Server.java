/**
 * author: loserStar
 * date: 2018年11月1日下午4:20:19
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package com.loserstar.webservice.base;

import javax.xml.ws.Endpoint;

/**
 * author: loserStar
 * date: 2018年11月1日下午4:20:19
 * remarks:
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String addr = "http://localhost:8888/loser";
		Endpoint.publish(addr, new TestServiceImp());
		System.out.println("started........");
	}

}
