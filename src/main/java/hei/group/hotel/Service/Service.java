package hei.group.hotel.Service;

import java.sql.Timestamp;

public class Service {
    public record Reservation(  int numero_chambre,
             String nom_client,
            String numero_telephone_client,
             String adrress_email,
             String description_chambre,
            Timestamp date_reservation) { }
}
