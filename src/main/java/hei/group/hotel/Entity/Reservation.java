package hei.group.hotel.Entity;
import java.sql.Timestamp;

@Entity
public class Reservation {
    private int numero_chambre;
    private String nom_client;
    private String numero_telephone_client;
    private String adrress_email;
    private String description_chambre;
    private Timestamp date_reservation;
}
