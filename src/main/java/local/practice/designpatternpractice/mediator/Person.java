package local.practice.designpatternpractice.mediator;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public ChatRoom room;
    private List<String> chatLog = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void receive(String sendar, String message) {
        String s = sendar + " : '" + message + "'";
        System.out.println("[" + name +"'s chat session] " + s);
        chatLog.add(s);
    }

    public void say(String meessage) {
        room.broadcast(name, meessage);
    }

    public void privateMessage(String who, String message) {
        room.message(name, who, message);
    }


}
