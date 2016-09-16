package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController{
	private static final String template = "Ssup, %s!";
	//each response has unique id!
	private final AtomicLong counter = new AtomicLong();

	/*handle a get request*/
	//maps all http methods; pass arg method=GET to be specific
	@RequestMapping("/greeting")
	//in RequestParam, value is argument name sent via URL
	public ResponseEntity<Greeting> greeting(@RequestParam(value="name", defaultValue="World") String name){
		Greeting greeting = new Greeting(counter.incrementAndGet(),
							String.format(template,name));
		return ResponseEntity.status(HttpStatus.CREATED).body(greeting);
		
	}
}