package javagroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


    @GetMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    @GetMapping("topics/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicService.getTopic(id);
    }
/*
   @GetMapping(method= RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);

    }*/


}

