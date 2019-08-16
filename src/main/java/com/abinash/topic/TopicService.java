package com.abinash.topic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topicList = new ArrayList<>(
//			Arrays.asList(new Topic("Java", "Core java", "Core Java Description"),
//					new Topic("Spring", "Spring Framework", "Spring FrameWork Description"),
//					new Topic("JavaScript", "Java Script", "Java Script Description")));

	public List<Topic> getTopics() {
//		return topicList;
		List<Topic> topicList1 = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topicList1::add);
		return topicList1;
	}

	public Optional<Topic> getTopic(String id) {
//		return topicList.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
//		topicList.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
//		for (int i = 0; i < topicList.size(); i++) {
//			Topic t = topicList.get(i);
//			if (t.getId().equals(id)) {
//				topicList.set(i, topic);
//				return;
//			}
//		}
	}

	public void deleteTopic(String id) {
//		topicList.removeIf(t -> t.getId().equalsIgnoreCase(id));
		topicRepository.deleteById(id);

	}

}
