package singleton.practice;

public class TicketMaker {
    private int ticket = 1000;
    private static final TicketMaker ticketMaker = new TicketMaker();

    public int getNextTicketNumber() {
        return ticket++;
    }
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}
