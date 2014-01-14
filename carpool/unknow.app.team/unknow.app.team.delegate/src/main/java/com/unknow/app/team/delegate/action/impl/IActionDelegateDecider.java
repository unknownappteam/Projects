package com.unknow.app.team.delegate.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unknow.app.team.delegate.action.IActionDelegateTemplate;
import com.unknow.app.team.delegate.action.map.ActionMap;
import com.unknow.app.team.delegate.exception.DelegateException;
import com.unknow.app.team.delegate.vo.IAction;

@Component
public class IActionDelegateDecider {

	@Autowired
	private ActionMap actionMap;
	
	
	public <T> T delegate(T t, IAction action) {
		
		if(t != null && action != null) {
			IActionDelegateTemplate actionTemplate = actionMap.getActionDelegate(action);
			return execute(t, actionTemplate, action);
		}
		return t;
	}
	
	
	private <T> T  execute(T t, IActionDelegateTemplate actionTemplate, IAction action) {
		
		if(actionTemplate == null) {
			throw new DelegateException("No Action template found for the action "+action);
		}
		return actionTemplate.execute(t);
	}
}
