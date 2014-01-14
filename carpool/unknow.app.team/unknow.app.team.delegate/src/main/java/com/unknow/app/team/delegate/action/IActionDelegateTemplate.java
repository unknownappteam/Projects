/**
 * 
 */
package com.unknow.app.team.delegate.action;


/**
 * @author KK
 *
 */
public interface IActionDelegateTemplate {

	<T> T execute(T t);
}
