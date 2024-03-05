public class CallByReference {
    int n = 100;

    void change_value(CallByReference obj) {
        obj.n = obj.n + 50;
    }

    public static void main(String[] args) {
        CallByReference cbr = new CallByReference();
        System.out.println("Before Calling n : " + cbr.n);
        cbr.change_value(cbr);
        System.out.println("After Calling n : " + cbr.n);
    }
}
