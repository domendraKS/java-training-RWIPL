class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are under age");
    }

    UnderAgeException(String msg) {
        super(msg);
    }
}

public class CheckedCustomizeException {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new UnderAgeException("You cannot vote");
            } else {
                System.out.println("You can vote successfully");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }
    }
}
