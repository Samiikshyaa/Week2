package Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Instagram extends CommunicationChannel{

    List<String>notes;
    Scanner sc = new Scanner(System.in);
    public Instagram(String account, String activeStatus) {
        super(account, activeStatus);
        this.notes = new ArrayList<>();
    }

    public void add_notes(){
        System.out.println("Add your notes: ");
        notes.add(sc.next());
        System.out.println("Notes added");
    }
    public void delete_notes(){
        System.out.println("Enter the notes you want to delete: ");
        notes.remove(sc.next());
        System.out.println("Notes deleted");
    }

}
