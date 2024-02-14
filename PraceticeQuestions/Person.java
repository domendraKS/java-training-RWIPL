package PraceticeQuestions;

public class Person {
    String name;
    int age;

    // setter
    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // getter
    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person p = new Person("Shubham Sahu", 22);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
