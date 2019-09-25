package local.practice.designpatternpractice.chainofresponsibility;

public class IncreaseDefenceModifier extends CreatureModifier {

    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Incresing "+ creature.getName()+"'s defence");
        creature.setDefence(creature.getDefence() + 3);
        super.handle();
    }
}
