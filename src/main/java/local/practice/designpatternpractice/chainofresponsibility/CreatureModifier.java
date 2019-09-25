package local.practice.designpatternpractice.chainofresponsibility;

public class CreatureModifier {

    public Creature creature;
    public CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void add(CreatureModifier modifier) {
        if(next != null) {
            next.add(modifier);
        }
        else next = modifier;
    }

    public void handle() {
        if(next != null) next.handle();
    }
}
