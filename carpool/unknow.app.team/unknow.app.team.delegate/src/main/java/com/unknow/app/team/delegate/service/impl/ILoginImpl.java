/**
 * 
 */
package com.unknow.app.team.delegate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unknow.app.team.delegate.action.impl.IActionDelegateDecider;
import com.unknow.app.team.delegate.service.ILogin;
import com.unknow.app.team.delegate.vo.IAction;
import com.unknow.app.team.delegate.vo.LoginUserVO;

/**
 * @author KK
 *
 */
@Service("iLogin")
public class ILoginImpl implements ILogin {

	@Autowired
	private IActionDelegateDecider actionDelegateDecider; 
	
	@Override
	public LoginUserVO validate(LoginUserVO userVO) {
		return actionDelegateDecider.delegate(userVO, IAction.VALIDATE_USER);
	}

}
