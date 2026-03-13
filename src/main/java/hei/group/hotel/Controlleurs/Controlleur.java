package hei.group.hotel.Controlleurs;

import hei.group.hotel.Service.Service;
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
    public Service.Reservation bookReservation(@RequestBody Service.Reservation reservation){
        reservations.add(reservation);
        return reservation;
    }
}
