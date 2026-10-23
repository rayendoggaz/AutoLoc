package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservation;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reservation")
public class ReservationRestController {

    private final IReservation reservationService;

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addreservation(reservation);
    }

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveReservation();
    }

    @GetMapping("/retrieve-reservation/{id}")
    public Reservation getReservation(@PathVariable Long id) {
        return reservationService.retrieveReservationById(id);
    }

    @DeleteMapping("/remove-reservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deletereservation(id);
    }
}