/**
 * 
 */
package com.unknow.app.team.delegate.exception;

/**
 * @author KK
 * 
 */
public class DelegateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2760048043161920602L;

	public DelegateException() {
		super();
	}

	public DelegateException(String exception) {
		super(exception);
	}

	public DelegateException(Throwable t) {
		super(t);
	}

	public DelegateException(String exception, Throwable t) {
		super(exception, t);
	}

}
