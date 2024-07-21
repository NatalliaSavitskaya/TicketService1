public class Ticket
{
    private char[] idTicket = new char[4];
    private char[] concertHall = new char[10];
    private int[] eventCode = new int[3];
    private long unixTimeStamp;
    private boolean isPromo;
    private char stadiumSector;
    private float maxWeight;
    private double price;

    public Ticket() {
    }

    public Ticket(char[] concertHall, int[] eventCode, long unixTimeStamp){
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.unixTimeStamp = unixTimeStamp;
    }

    public Ticket(char[] idTicket, char[] concertHall, int[] eventCode, long unixTimeStamp, boolean isPromo,
                  char stadiumSector, float maxWeight, double price){
        this.idTicket = idTicket;
        this.concertHall =concertHall;
        this.eventCode =eventCode;
        this.unixTimeStamp = unixTimeStamp;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxWeight = maxWeight;
        this.price = price;
    }

    public void printTicket(){
        System.out.println("Ticket ID: " + new String(idTicket));
        System.out.println("The concert hall is: " + new String(concertHall));
        System.out.println("The event code is: " + mergeArrayToString(eventCode));
        System.out.println("The ticket creation time is: " + unixTimeStamp);
        System.out.println("This is a promo ticket: " + isPromo);
        System.out.println("The stadium sector is: " + stadiumSector);
        System.out.println("Max allowed backpack weight (kg.g): " + maxWeight);
        System.out.println("The price of the ticket is: " + price);
    }

    public String mergeArrayToString(int[] arrayNumbers) {
        StringBuilder sb = new StringBuilder();
        for (int number : arrayNumbers) {
            sb.append(number);
        }
        return sb.toString();
    }
}