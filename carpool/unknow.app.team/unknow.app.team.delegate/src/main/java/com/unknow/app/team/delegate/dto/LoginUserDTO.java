package com.unknow.app.team.delegate.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_login_user database table.
 * 
 */
@Entity
@Table(name="t_login_user")
@NamedQuery(name="LoginUserDTO.findAll", query="SELECT l FROM LoginUserDTO l")
public class LoginUserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5720607346508624482L;

	@Id
	@Column(name="LOGIN_ID")
	private int loginId;

	@Column(name="CAR_REGI_NUM")
	private String carRegiNum;

	@Column(name="EMAIL_CONFORM_STR")
	private String emailConformStr;

	@Column(name="HINT_PASSWORD")
	private String hintPassword;

	@Column(name="HINT_QUESTION")
	private String hintQuestion;

	@Column(name="IS_ACTIVE_USER")
	private byte isActiveUser;

	@Column(name="IS_CONNECTED")
	private byte isConnected;

	@Temporal(TemporalType.DATE)
	@Column(name="LOGIN_CREATED_DATE")
	private Date loginCreatedDate;

	@Column(name="LOGIN_PASSWORD")
	private String loginPassword;

	@Column(name="LOGIN_USER")
	private String loginUser;

	@Column(name="USER_EMAIL_ID")
	private String userEmailId;

	public LoginUserDTO() {
	}

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