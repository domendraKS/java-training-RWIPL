class UnderAgeException extends RuntimeException {
    UnderAgeException() {
        super("You are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}

public class UncheckedCustomizeException {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new UnderAgeException();
            } else {
                System.out.println("You can vote successfully");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
    }
}
