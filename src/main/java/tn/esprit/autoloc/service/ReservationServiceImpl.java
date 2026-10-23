package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.IReservationRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservation {

    private final IReservationRepo reservationRepo;

    @Override
    public Reservation addreservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void deletereservation(long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> retrieveReservation() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation retrieveReservationById(long id) {
        return reservationRepo.findById(id).orElse(null);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }
}