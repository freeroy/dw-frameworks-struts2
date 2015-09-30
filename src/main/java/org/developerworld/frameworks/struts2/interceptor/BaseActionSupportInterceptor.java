package org.developerworld.frameworks.struts2.interceptor;

import org.apache.commons.lang.StringUtils;
import org.developerworld.frameworks.struts2.action.AbstractBaseActionSupport;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 基础Action支持类拦截器
 * @author Roy Huang
 * @version 20111025
 *
 */
public class BaseActionSupportInterceptor extends AbstractInterceptor {
	
	private String responseCharacterEncoding;
	
	public void setResponseCharacterEncoding(String responseCharacterEncoding){
		this.responseCharacterEncoding=responseCharacterEncoding;
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Object _action=arg0.getAction();
		if(_action instanceof AbstractBaseActionSupport){
			AbstractBaseActionSupport action=(AbstractBaseActionSupport)_action;
			if(StringUtils.isNotEmpty(responseCharacterEncoding))
				action.setResponseCharacterEncoding(responseCharacterEncoding);
		}	
		return arg0.invoke();
	}

}
