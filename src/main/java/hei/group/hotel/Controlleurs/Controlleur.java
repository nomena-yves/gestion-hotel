package hei.group.hotel.Controlleurs;

import hei.group.hotel.Service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controlleur {
    List<Service.Reservation> reservations = new ArrayList<>();



    @GetMapping("/booking")
public List<Service.Reservation> getBooking(){
return reservations;
    }

}
