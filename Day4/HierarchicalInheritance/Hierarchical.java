package Day4.HierarchicalInheritance;

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance..!");
        Cat c = new Cat();
        c.cat();
        c.eating();

        Dog d = new Dog();
        d.dog();
        d.eating();
    }
}
