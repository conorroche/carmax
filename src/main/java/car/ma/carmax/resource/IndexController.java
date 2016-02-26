package car.ma.carmax.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to Carmax Home";
	}

}
