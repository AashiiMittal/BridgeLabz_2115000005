class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;
    public TicketNode(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservationSystem {
    private TicketNode head;
    public TicketReservationSystem() {
        this.head = null;
    }
    public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }
    public void removeTicket(int ticketId) {
        if (head == null) return;
        if (head.ticketId == ticketId) {
            if (head.next == head) {
                head = null;
            } else {
                TicketNode temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }
        TicketNode current = head;
        TicketNode prev = null;
        while (current != head || prev == null) {
            if (current.ticketId == ticketId) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }
        TicketNode temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }
    public void searchTicketByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }
        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket Found: ID: " + temp.ticketId + ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket not found for customer: " + customerName);
    }
    public void searchTicketByMovieName(String movieName) {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }
        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket Found: ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket not found for movie: " + movieName);
    }
    public int getTotalBookedTickets() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
    public static void main(String[] args) {
        TicketReservationSystem reservationSystem = new TicketReservationSystem();
        reservationSystem.addTicket(1, "Aashi", "Avatar", 1, "2025-02-11 18:00");
        reservationSystem.addTicket(2, "Ayush", "Avatar", 2, "2025-02-11 18:30");
        reservationSystem.addTicket(3, "Akrati", "Inception", 3, "2025-02-11 19:00");
        reservationSystem.addTicket(4, "Arpit", "Inception", 4, "2025-02-11 19:30");
        reservationSystem.displayTickets();
        System.out.println("Searching for tickets by customer name:");
        reservationSystem.searchTicketByCustomerName("Aashi");
        reservationSystem.searchTicketByCustomerName("Akrati");
        System.out.println("Searching for tickets by movie name:");
        reservationSystem.searchTicketByMovieName("Avatar");
        reservationSystem.searchTicketByMovieName("Titanic");
        System.out.println("Total booked tickets: " + reservationSystem.getTotalBookedTickets());
        reservationSystem.removeTicket(3);
        System.out.println("Tickets after removal:");
        reservationSystem.displayTickets();
    }
}
