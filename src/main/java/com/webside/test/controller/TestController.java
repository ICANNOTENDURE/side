package com.webside.test.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webside.common.Common;

@Controller
@Scope("prototype")
@RequestMapping(value = "/test/")
public class TestController {

	@RequestMapping("listUI.html")
	public String listUI() {

		return Common.BACKGROUND_PATH + "/loginfo/list";

	}

}
