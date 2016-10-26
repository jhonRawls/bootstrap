package cn.ibadi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模板
 * @author jhon
 *
 */
@Controller
public class TemplateController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/left")
	public String left() {
		return "public/left";
	}

	@RequestMapping("/header")
	public String header() {
		return "public/header";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@RequestMapping("/widgets")
	public String widgets() {
		return "html/widgets";
	}
	
	@RequestMapping("/chartjs")
	public String chartjs() {
		return "html/charts/chartjs";
	}
	
	@RequestMapping("/morris")
	public String morris() {
		return "html/charts/morris";
	}

	@RequestMapping("/flot")
	public String flot() {
		return "html/charts/flot";
	}
	
	@RequestMapping("/inline")
	public String inline() {
		return "html/charts/inline";
	}
	
}
