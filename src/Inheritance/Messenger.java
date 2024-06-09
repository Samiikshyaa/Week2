package Inheritance;

import java.util.*;

public class Messenger extends CommunicationChannel {
    int count =0;
    List<String> stories;
    Map<String, Integer> view_count;

    public Messenger(String account, String activeStatus) {
        super(account, activeStatus);
        this.stories = new ArrayList<>();
        this.view_count = new HashMap<>();
    }

    public void addstory (String story){
        stories.add(story);
        view_count.put(story,0);
        System.out.println("Story Added");
    }

    public void removestory(String story){
        if(stories.remove(story)) {
            view_count.remove(story);
            System.out.println("Story Removed");
        } else{
            System.out.println("The story is invalid.");
        }
    }

    public void story_count(String story){
        if(view_count.containsKey(story)){
            int count = view_count.get(story)+1;
            view_count.put(story,count);
            System.out.println("The story view is: ");
            System.out.println(story + " = "+view_count.get(story));
        }else{
            System.out.println("The story is invalid.");
        }
    }
}
