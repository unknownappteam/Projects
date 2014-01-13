/**
 * 
 */
package com.unknown.app.team.intr.vo;

/**
 * @author KK
 * 
 */
public enum IAction {
	VALIDATE_USER("VALIDATE_USER"), NEW_USER("NEW_USER"), 
	UPDATE_USER("UPDATE_USER"), ACITVATE_USER("ACITVATE_USER"),
	DEACTIVATE_USER("DEACTIVATE_USER"), DELETE_USER("DELETE_USER");
	
	private String action;
	
	IAction(String action) {
		this.action = action;
	}
	
	public String toString() {
		return action;
	}
}
