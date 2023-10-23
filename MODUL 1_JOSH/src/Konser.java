public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String bandName;
    private String date;
    private String location;
    private String ticketPrice;

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getBandName(){
        return bandName;
    }
    public String getDate(){
        return date;
    }
    public String getLocation(){
        return location;
    }
    public String getTicketPrice(){
        return ticketPrice;
    }

}