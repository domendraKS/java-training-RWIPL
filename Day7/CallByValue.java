public class CallByValue {
    int n = 100;

    void change_value(int n) {
        n = n + 50;
    }

    public static void main(String[] args) {
        CallByValue cbv = new CallByValue();
        System.out.println("Before Calling n : " + cbv.n);
        cbv.change_value(cbv.n);
        System.out.println("After Calling n : " + cbv.n);
    }
}
