package hei.group.hotel.Controlleurs;

import hei.group.hotel.Service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controlleur {
    List<Service.Reservation> reservations = new ArrayList<>();



    @GetMapping("/booking")
public List<Service.Reservation> getBooking(){
return reservations;
    }

    @PostMapping("/booking")
    public ResponseEntity<List<Service.Reservation>> bookReservation(
            @RequestBody List<Service.Reservation> nouvellesReservations) {


        for (Service.Reservation r : nouvellesReservations) {
            if (r.numero_chambre() <= 0 || r.numero_chambre() >= 9 ||
                    r.date_reservation() == null) {
                return ResponseEntity.badRequest()
                        .body(List.of());
            }
        }


        for (Service.Reservation nouvelle : nouvellesReservations) {
            boolean dejaReservee = reservations.stream()
                    .anyMatch(existante ->
                            existante.numero_chambre() == nouvelle.numero_chambre() &&
                                    existante.date_reservation().equals(nouvelle.date_reservation())
                    );

            if (dejaReservee) {
                String message = String.format(
                        "La chambre %d est déjà réservée le %s",
                        nouvelle.numero_chambre(), nouvelle.date_reservation()
                );

                return ResponseEntity.status(HttpStatus.CONFLICT)
                        .body(List.of());
            }
        }


        reservations.addAll(nouvellesReservations);


        return ResponseEntity.status(HttpStatus.CREATED)
                .body(nouvellesReservations);
    }
}
