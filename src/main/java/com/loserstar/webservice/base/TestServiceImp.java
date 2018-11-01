/**
 * author: loserStar
 * date: 2018年11月1日下午4:53:46
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package com.loserstar.webservice.base;

import javax.jws.WebService;

/**
 * author: loserStar
 * date: 2018年11月1日下午4:53:46
 * remarks:
 */
@WebService(endpointInterface="com.loserstar.webservice.base.TestService")
public class TestServiceImp implements TestService {

	@Override
	public void tt() {
		System.out.println("ttttttttttttttttttt");
	}

	@Override
	public String add(String a) {
		a=a+"------这是远程Server端给加上的字符串";
		return a;
	}

}
