class BookThreaterSeat {
    int total_seats = 10;

    void bookSeats(int seats) {
        if (total_seats >= seats) {
            System.out.println("Seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println(total_seats + " Remaining");
        } else {
            System.out.println("Only " + total_seats + " seats remaining");
        }
    }
}

class MovieBookApp extends Thread {
    static BookThreaterSeat bts;
    int seats;

    public void run() {
        bts.bookSeats(seats);
    }

    public static void main(String[] args) {
        bts = new BookThreaterSeat();
        MovieBookApp shubham = new MovieBookApp();
        shubham.seats = 7;
        shubham.start();
        // try {
        // shubham.join();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        MovieBookApp piyush = new MovieBookApp();
        piyush.seats = 6;
        piyush.start();
    }
}
