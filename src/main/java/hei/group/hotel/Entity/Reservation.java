package hei.group.hotel.Entity;
import java.sql.Timestamp;


public class Reservation {
    private int numero_chambre;
    private String nom_client;
    private String numero_telephone_client;
    private String adrress_email;
    private String description_chambre;
    private Timestamp date_reservation;

    public int getNumero_chambre() {
        return numero_chambre;
    }

    public void setNumero_chambre(int numero_chambre) {
        this.numero_chambre = numero_chambre;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getNumero_telephone_client() {
        return numero_telephone_client;
    }

    public void setNumero_telephone_client(String numero_telephone_client) {
        this.numero_telephone_client = numero_telephone_client;
    }

    public String getAdrress_email() {
        return adrress_email;
    }

    public void setAdrress_email(String adrress_email) {
        this.adrress_email = adrress_email;
    }

    public String getDescription_chambre() {
        return description_chambre;
    }

    public void setDescription_chambre(String description_chambre) {
        this.description_chambre = description_chambre;
    }

    public Timestamp getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(Timestamp date_reservation) {
        this.date_reservation = date_reservation;
    }
}
