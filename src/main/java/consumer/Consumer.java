package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.WelcomeService;


@Controller
@RequestMapping("/")
public class Consumer {
	
	@Autowired
	WelcomeService welcomeService;
	
	@RequestMapping("/ctservice")
	@ResponseBody
	public String contactService(){
		return welcomeService.sayHello();
	}
	@RequestMapping("/index")
	@ResponseBody
	public String index(){
		return "index";
	}
}
