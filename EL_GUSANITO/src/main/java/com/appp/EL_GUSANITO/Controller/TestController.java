package com.appp.EL_GUSANITO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ChiquitoS11
 */
@Controller
public class TestController {
        @GetMapping("/test")
	public String login_and_register(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "./test";
	}
}
