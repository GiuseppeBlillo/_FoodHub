package java13g3.foodHub.controllers;

import java13g3.foodHub.entities.Reservation;
import java13g3.foodHub.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/create")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation Reservation) {
        return ResponseEntity.ok(reservationService.createReservation(Reservation));
    }


    @GetMapping("/retrieve")
    public ResponseEntity<List<Reservation>> getAllReservation() {
        if(!reservationService.getReservations().isEmpty()){
            return ResponseEntity.ok(reservationService.getReservations());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Optional<Reservation>> getReservationById(@PathVariable("id") Long id) {
        if(reservationService.getReservationById(id).isPresent()){
            return ResponseEntity.ok(reservationService.getReservationById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Reservation>> updateReservationById(@PathVariable("id") Long id, @RequestBody Reservation Reservation) {
        if (reservationService.getReservationById(id).isPresent()) {
            return ResponseEntity.ok(reservationService.updateReservationById(id, Reservation));
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReservationById(@PathVariable("id") Long id) {
        if (reservationService.getReservationById(id).isPresent()) {
            reservationService.deleteReservationById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}

