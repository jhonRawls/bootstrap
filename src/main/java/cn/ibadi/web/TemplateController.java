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

	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}
	
	@RequestMapping("/left")
	public String left() {
		return "public/left";
	}

	@RequestMapping("/header")
	public String header() {
		return "public/header";
	}
	
//	@RequestMapping("/login")
//	public String login() {
//		return "user/login";
//	}
	
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
	
	@RequestMapping("/general")
	public String general() {
		return "html/ui/general";
	}
	
	@RequestMapping("/icons")
	public String icons() {
		return "html/ui/icons";
	}
	
	@RequestMapping("/buttons")
	public String buttons() {
		return "html/ui/buttons";
	}
	
	@RequestMapping("/sliders")
	public String sliders() {
		return "html/ui/sliders";
	}
	
	@RequestMapping("/timeline")
	public String timeline() {
		return "html/ui/timeline";
	}
	
	@RequestMapping("/modals")
	public String modals() {
		return "html/ui/modals";
	}
	
	@RequestMapping("/general_element")
	public String general_element() {
		return "html/forms/general";
	}
	
	@RequestMapping("/advanced")
	public String advanced() {
		return "html/forms/advanced";
	}
	
	@RequestMapping("/editors")
	public String editors() {
		return "html/forms/editors";
	}
	
	@RequestMapping("/simple-table")
	public String simple() {
		return "html/tables/simple";
	}
	
	@RequestMapping("/data-table")
	public String data() {
		return "html/tables/data";
	}
	
	@RequestMapping("/calendar")
	public String calendar() {
		return "html/calendar";
	}
	
	//右键
	@RequestMapping("/mailbox")
	public String mailbox() {
		return "html/mailbox/mailbox";
	}
	
	@RequestMapping("/compose")
	public String compose() {
		return "html/mailbox/compose";
	}
	
	@RequestMapping("/read-mail")
	public String readMail() {
		return "html/mailbox/read-mail";
	}
	
	//案例
	@RequestMapping("/invoice")
	public String invoice() {
		return "html/examples/invoice";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "html/examples/profile";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "html/examples/login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "html/examples/register";
	}
	
	@RequestMapping("/lockscreen")
	public String lockscreen() {
		return "html/examples/lockscreen";
	}
	
	@RequestMapping("/404")
	public String notFound() {
		return "html/examples/404";
	}
	
	@RequestMapping("/500")
	public String interError() {
		return "html/examples/500";
	}
	
	@RequestMapping("/blank")
	public String blank() {
		return "html/examples/blank";
	}
	
	@RequestMapping("/pace")
	public String pace() {
		return "html/examples/pace";
	}
	
	//布局
	@RequestMapping("/top-nav")
	public String topNav() {
		return "html/layout/top-nav";
	}
	
	@RequestMapping("/boxed")
	public String boxed() {
		return "html/layout/boxed";
	}
	
	@RequestMapping("/fixed")
	public String fixed() {
		return "html/layout/fixed";
	}
	
	@RequestMapping("/collapsed-sidebar")
	public String collapsedSidebar() {
		return "html/layout/collapsed-sidebar";
	}
	
}
