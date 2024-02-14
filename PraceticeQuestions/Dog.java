package PraceticeQuestions;

public class Dog {
    private String name;
    private String breed;

    Dog(String n, String b) {
        this.name = n;
        this.breed = b;
    }

    void setName(String n) {
        this.name = n;
    }

    void setBreed(String b) {
        this.breed = b;
    }

    String getName() {
        return this.name;
    }

    String getBreed() {
        return this.breed;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("tommy", "a");
        Dog d2 = new Dog("tiger", "b");

        System.out.println(d1.getName() + " --- " + d1.getBreed());
        System.out.println(d2.getName() + " --- " + d2.getBreed());

        d1.setName("Buddy");
        d2.setBreed("German Shepherd");

        System.out.println("\nAfter Modification");

        System.out.println(d1.getName() + " --- " + d1.getBreed());
        System.out.println(d2.getName() + " --- " + d2.getBreed());
    }
}
