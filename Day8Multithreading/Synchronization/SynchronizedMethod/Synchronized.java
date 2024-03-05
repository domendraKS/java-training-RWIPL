class BookThreaterSeat {
    int total_seats = 10;

    synchronized void bookSeats(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " Seats Booked successfully");
            total_seats = total_seats - seats;
            System.out.println(total_seats + " Remaining");
        } else {
            System.out.println("Only " + total_seats + " seats remaining");
        }
    }
}

class Synchronized extends Thread {
    static BookThreaterSeat bts;
    int seats;

    public void run() {
        bts.bookSeats(seats);
    }

    public static void main(String[] args) {
        bts = new BookThreaterSeat();
        Synchronized shubham = new Synchronized();
        shubham.seats = 6;
        shubham.start();

        Synchronized piyush = new Synchronized();
        piyush.seats = 6;
        piyush.start();
    }
}
