/**
 * author: loserStar
 * date: 2018年11月1日下午4:21:30
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package com.loserstar.webservice.base;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * author: loserStar
 * date: 2018年11月1日下午4:21:30
 * remarks:
 */
@WebService
public interface TestService {

	@WebResult
	public void tt();
	@WebResult
	public String add(@WebParam(name="a") String a);
}
