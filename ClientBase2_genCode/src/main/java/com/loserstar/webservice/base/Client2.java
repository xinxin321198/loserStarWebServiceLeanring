/**
 * author: loserStar
 * date: 2018年11月1日下午9:19:27
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package com.loserstar.webservice.base;

/**
 * author: loserStar
 * date: 2018年11月1日下午9:19:27
 * remarks:
 */
public class Client2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestServiceImpService testServiceImpService = new TestServiceImpService();
		TestService testService = testServiceImpService.getTestServiceImpPort();
		System.out.println(testService.add("这是使用wsimport命令生成的客户端"));
	}

}
