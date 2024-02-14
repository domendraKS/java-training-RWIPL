package Day4.MultiLevelInheritance;

public class MultiLevel {
    public static void main(String[] args) {
        System.out.println("Multilevel Inheritance..!");
        GrandSon gs = new GrandSon();

        gs.grandSon();
        gs.son();
        gs.father();
    }
}
