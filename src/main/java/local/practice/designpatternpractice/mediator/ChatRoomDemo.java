package local.practice.designpatternpractice.mediator;

public class ChatRoomDemo {

    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        Person john = new Person("John");
        Person jane = new Person("Jane");

        room.join(john);
        room.join(jane);

        john.say("hi room");
        jane.say("oh, hey John");

        Person simon = new Person("Simon");

        room.join(simon);
        simon.say("hi everyone");

        jane.privateMessage("Simon", "glad you could join us");
        jane.say("hello");
    }
}
