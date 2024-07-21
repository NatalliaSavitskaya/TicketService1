class TicketService
{
    public static void main(String []args)
    {
        Ticket emptyTicket = new Ticket();
        System.out.println("The info about the empty ticket is:");
        emptyTicket.printTicket();

        char[] concertHall = {'1','1','1','1','1','1','1','1','1','1'};
        int[] eventCode = {1,1,1};
        long unixTimeStamp = System.currentTimeMillis()/1000L;
        Ticket limitedTicket = new Ticket(concertHall, eventCode, unixTimeStamp);
        System.out.println("The info about the limited ticket is:");
        limitedTicket.printTicket();

        char[] idTicket = {'1','1','1','1'};
        Ticket fullTicket = new Ticket(idTicket, concertHall, eventCode, unixTimeStamp,
                true, 'A', 55.95F, 12.35);
        System.out.println("The info about the full ticket is:");
        fullTicket.printTicket();
    }
};
