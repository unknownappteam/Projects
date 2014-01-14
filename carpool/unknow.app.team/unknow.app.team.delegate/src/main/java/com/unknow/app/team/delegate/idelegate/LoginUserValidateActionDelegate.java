/**
 * 
 */
package com.unknow.app.team.delegate.idelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unknow.app.team.delegate.action.impl.AbstractActionDelegateTemplate;
import com.unknow.app.team.delegate.action.map.ActionMap;
import com.unknow.app.team.delegate.dto.LoginUserDTO;
import com.unknow.app.team.delegate.service.ILoginService;
import com.unknow.app.team.delegate.vo.IAction;



/**
 * @author KK
 *
 */
@Component("loginUserValidateActionDelegate")
public class LoginUserValidateActionDelegate extends AbstractActionDelegateTemplate<LoginUserDTO> {
	
	@Autowired
	private ActionMap actionMap;
	@Autowired
	private ILoginService iLoginService;
	
	@Override
	public void setDTO() {
		this.v  = new LoginUserDTO();
	}

	@Override
	public LoginUserDTO iExecute(LoginUserDTO v) {
		
		return v;
	}

	@Override
	public void registerDelegate() {
		actionMap.registerDelegate(IAction.VALIDATE_USER, this);
	}

	@Override
	public void afterPropertiesSet() {
		registerDelegate();
	}

}
