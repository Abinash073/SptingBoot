package com.abinash.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;

	@GetMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}

	@GetMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@PostMapping("/topics/add")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@PutMapping("/topics/update/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}

	@DeleteMapping("/topics/delete/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
