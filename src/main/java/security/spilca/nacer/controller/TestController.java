package security.spilca.nacer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String helloTest() {
		return "hello from Resources OAuth2 servert \t\n"
				+"Token cheked in DB \t\n"
				+"OK we know its an SOA antiePattern, it a just for Test";
	}
}
