public class ConstructorChaining {
    public ConstructorChaining(){
//        this("Venu");
        System.out.println("Default Constructor");
    }

    public ConstructorChaining(String name){
        this();
        System.out.println(name+" Parameterized Constructor");
    }

    public static void main(String[] args) {
//        ConstructorChaining CC = new ConstructorChaining();
        ConstructorChaining CC = new ConstructorChaining("Venu");
    }
}
