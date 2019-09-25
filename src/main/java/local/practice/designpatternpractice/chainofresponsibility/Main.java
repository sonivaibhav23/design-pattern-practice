package local.practice.designpatternpractice.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        Creature goblin = new Creature("Goblin", 2, 2);
        System.out.println(goblin);

        CreatureModifier root = new CreatureModifier(goblin);
        root.add(new DoubleAttackModifier(goblin));
        root.add(new IncreaseDefenceModifier(goblin));

        root.handle();
        System.out.println(goblin);
    }
}
