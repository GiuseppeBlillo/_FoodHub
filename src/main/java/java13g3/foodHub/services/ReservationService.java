package java13g3.foodHub.services;

import java13g3.foodHub.entities.Reservation;
import java13g3.foodHub.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation Reservation){
        return reservationRepository.save(Reservation);
    }

    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(Long id){
        return reservationRepository.findById(id);
    }

    public Optional<Reservation> updateReservationById(Long id, Reservation updateReservation){
        Optional<Reservation> cusTemp = reservationRepository.findById(id);
        if (cusTemp.isPresent()){
            Reservation temp = cusTemp.get();
            temp.setCustomer(updateReservation.getCustomer());
            temp.setRestaurant(updateReservation.getRestaurant());
            temp.setSeats(updateReservation.getSeats());
            reservationRepository.save(temp);
            return Optional.of(temp);
        } else {
            return Optional.empty();
        }
    }

    public void deleteReservationById(Long id){
        reservationRepository.deleteById(id);
    }
}
