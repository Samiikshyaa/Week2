package Inheritance;

import java.util.Scanner;

public class CommTest {
    public static void main(String[] args) {
        char flag = 'y';
        Scanner sc = new Scanner(System.in);

        CommunicationChannel ci = new Instagram("User1", "active");
        ci.audio_call();
        ci.video_call();
        CommunicationChannel cin = new Instagram("User2", "unactive");
        cin.audio_call();
        cin.video_call();

        Messenger cm = new Messenger("User1", "active");
        do {
            System.out.println("Enter the story to add: ");
            String story = sc.next();
            cm.addstory(story);
            System.out.println("Do you want to add more? [y/n]");
            flag = sc.next().charAt(0);
        }while(flag == 'y');

        System.out.println("Enter the story to delete: ");
        String storydel = sc.next();
        cm.removestory(storydel);
        System.out.println("Which story do you want to view? ");
        cm.story_count(sc.next());
    }
}
