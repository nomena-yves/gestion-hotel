package hei.group.hotel.Controlleurs;
import hei.group.hotel.Entity.Reservation;
import hei.group.hotel.Service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlleur {
    List<Reservation> reservations;



    @GetMapping("/booking")
public List<Reservation> getBooking(){
return reservations;
    }
}
