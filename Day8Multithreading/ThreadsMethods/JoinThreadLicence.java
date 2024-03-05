class MedicalTest extends Thread {
    public void run() {
        try {
            System.out.println("Medical Test Start");
            Thread.sleep(3000);
            System.out.println("Medical Test Complete");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class DriveTest extends Thread {
    public void run() {
        try {
            System.out.println("Test Drive Start");
            Thread.sleep(5000);
            System.out.println("Test Drive Complete");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread {
    public void run() {
        try {
            System.out.println("Officer Take a file");
            Thread.sleep(3000);
            System.out.println("Office work complete");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class JoinThreadLicence {
    public static void main(String[] args) {
        System.out.println("Licence Making Process Start");
        try {
            Thread.sleep(1000);
            MedicalTest mt = new MedicalTest();
            mt.start();
            mt.join();

            DriveTest dt = new DriveTest();
            dt.start();
            dt.join();

            OfficerSign os = new OfficerSign();
            os.start();
            os.join();

            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Got Licence");
    }
}
