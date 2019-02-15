package springboot.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.service.*;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService _welcomeService;
		
	@RequestMapping("/welcome")
	public String welcome() {
		return _welcomeService.getWelcomeMessage();
	}
}
