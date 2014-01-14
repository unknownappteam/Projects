/**
 * 
 */
package com.unknow.app.team.delegate.action.map;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.unknow.app.team.delegate.action.IActionDelegateTemplate;
import com.unknow.app.team.delegate.vo.IAction;

/**
 * @author KK
 * 
 */
@Component
public class ActionMap {

	private Map<IAction, IActionDelegateTemplate> actionDeiderMap = new HashMap<IAction, IActionDelegateTemplate>();
		
	public IActionDelegateTemplate getActionDelegate(IAction action) {
		return actionDeiderMap.get(action);
	}
	
	public void registerDelegate(IAction action, IActionDelegateTemplate template) {
		actionDeiderMap.put(action, template);
	}
}
