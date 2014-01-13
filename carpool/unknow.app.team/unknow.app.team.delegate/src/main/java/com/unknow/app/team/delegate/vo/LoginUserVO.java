/**
 * 
 */
package com.unknown.app.team.intr.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author KK
 *
 */
public class LoginUserVO implements Serializable  {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7786781735363532025L;

	private int loginId;

	private String carRegiNum;

	private String emailConformStr;

	private String hintPassword;

	private String hintQuestion;

	private byte isActiveUser;

	private byte isConnected;

	private Date loginCreatedDate;

	private String loginPassword;

	private String loginUser;

	private String userEmailId;

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getCarRegiNum() {
		return this.carRegiNum;
	}

	public void setCarRegiNum(String carRegiNum) {
		this.carRegiNum = carRegiNum;
	}

	public String getEmailConformStr() {
		return this.emailConformStr;
	}

	public void setEmailConformStr(String emailConformStr) {
		this.emailConformStr = emailConformStr;
	}

	public String getHintPassword() {
		return this.hintPassword;
	}

	public void setHintPassword(String hintPassword) {
		this.hintPassword = hintPassword;
	}

	public String getHintQuestion() {
		return this.hintQuestion;
	}

	public void setHintQuestion(String hintQuestion) {
		this.hintQuestion = hintQuestion;
	}

	public byte getIsActiveUser() {
		return this.isActiveUser;
	}

	public void setIsActiveUser(byte isActiveUser) {
		this.isActiveUser = isActiveUser;
	}

	public byte getIsConnected() {
		return this.isConnected;
	}

	public void setIsConnected(byte isConnected) {
		this.isConnected = isConnected;
	}

	public Date getLoginCreatedDate() {
		return this.loginCreatedDate;
	}

	public void setLoginCreatedDate(Date loginCreatedDate) {
		this.loginCreatedDate = loginCreatedDate;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginUser() {
		return this.loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getUserEmailId() {
		return this.userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}


}
