package javagroup;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@Service
public class TopicService {

    public List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Diana", " description"),
                new Topic("ID02", "Diego", " description"),
                new Topic("ID03", "David", " description"),
                new Topic("ID04", "Lesbia", " description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


}
