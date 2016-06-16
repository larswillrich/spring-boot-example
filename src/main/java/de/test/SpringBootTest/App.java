package de.test.SpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class App {

	@RequestMapping("/")
	@ResponseBody
	String getCar() {

		return "car";
	}

	@RequestMapping(value = "/blaa/{lastname}", method = RequestMethod.GET)
	@ResponseBody
	String home2(@PathVariable String lastname, @RequestParam("firstname") String firstname) {
		return "Hello World! " + firstname + " " + lastname;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
