package kafka.producer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kafka.producer.demo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	private static final String TOPIC="Kafka_Example.";
	
	@GetMapping("/message/{username}")
	private String getUser(@PathVariable String username, @RequestBody User user)
	{
		kafkaTemplate.send(TOPIC,user);
		return "Message published successfully";
	}

}
