import java.util.List;
import java.util.ArrayList;

public class Database {
    
    // TODO: Create List of Konser Object to Store Konser from Konser Class
        private List<Konser> listKonser = new ArrayList<Konser>();
            
    
    // TODO: Create Method to insert Konser to Database
        public void insertKonser(Konser konser){
            listKonser.add(konser);

        }

    // TODO: Create Method to Show Konser from Database
        public void displayKonser(String displayKonser){
        

        }
    // TODO: Create Method to Buy Ticket and Show the Total Price
        public void buyTicket(int index, int jumlah){
            Konser konser = listKonser.get(index);
            int jumlahHarga = konser.getTicketPrice() + jumlah;
        }
    }

