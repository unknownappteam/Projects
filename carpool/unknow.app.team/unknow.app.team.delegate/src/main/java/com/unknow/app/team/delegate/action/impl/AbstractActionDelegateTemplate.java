/**
 * 
 */
package com.unknow.app.team.delegate.action.impl;

import org.springframework.beans.factory.InitializingBean;

import com.unknow.app.team.delegate.action.IActionDelegateTemplate;
import com.unknow.app.team.delegate.exception.DelegateException;
import com.unknow.app.team.delegate.util.CopyUtil;

/**
 * @author KK
 * 
 */
public abstract class AbstractActionDelegateTemplate<V> implements
		IActionDelegateTemplate, InitializingBean {

	protected V v;


	public <T> T execute(T t) {

		if (t != null) {

			if (v == null) {
				throw new DelegateException("DTO can not be null.");
			}
			CopyUtil.copy(t, v);
			v = iExecute(v);
			CopyUtil.copy(v, t);
		}
		return t;
	}

	public abstract void setDTO();
	public abstract void registerDelegate();

	public abstract V iExecute(V v);
}
