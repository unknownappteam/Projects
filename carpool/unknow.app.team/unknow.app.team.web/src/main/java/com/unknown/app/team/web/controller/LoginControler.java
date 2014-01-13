package com.unknown.app.team.web.controller;

/**
 * 
 */


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unknown.app.team.intr.service.ILogin;
import com.unknown.app.team.intr.vo.IAction;
import com.unknown.app.team.intr.vo.LoginUserVO;

/**
 * @author KK
 * 
 */
@Controller
public class LoginControler {
	private static final Logger LOGGER = Logger.getLogger(LoginControler.class);
	@Autowired
	@Qualifier("iLogin")
	private ILogin login;
	
	
	@RequestMapping("/loginuser")
	public String showMessage1(SitePreference sitePreference, Device device,
			Model model) {
		
		LOGGER.info("SitePreference : " + sitePreference);
		LOGGER.info("Device : " + device);
		model.addAttribute("message", "Hello World!");
		login.validate(new LoginUserVO(), IAction.VALIDATE_USER);
		return "helloWorld";
	}
	
	@RequestMapping("/disp")
	public String disp(SitePreference sitePreference, Device device,
			Model model) {
		
		LOGGER.info("SitePreference : " + sitePreference);
		LOGGER.info("Device : " + device);
		model.addAttribute("message", "Hello World!");
		login.validate(new LoginUserVO(), IAction.VALIDATE_USER);
		return "helloWorld";
	}
}
