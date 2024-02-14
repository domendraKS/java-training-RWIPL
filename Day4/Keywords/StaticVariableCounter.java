// package Day4.Keywords;

public class StaticVariableCounter {
    static int count = 0;

    StaticVariableCounter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticVariableCounter c1 = new StaticVariableCounter();
        StaticVariableCounter c2 = new StaticVariableCounter();
        StaticVariableCounter c3 = new StaticVariableCounter();
    }
}
