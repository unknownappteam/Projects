/**
 * 
 */
package com.unknow.app.team.delegate.service;

import com.unknow.app.team.delegate.vo.LoginUserVO;


/**
 * @author KK
 *
 */
public interface ILogin {
	LoginUserVO validate(LoginUserVO userVO);
}
