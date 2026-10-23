package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;
import java.util.List;

public interface IReservation {
    Reservation addreservation(Reservation reservation);
    void deletereservation(long id);
    List<Reservation> retrieveReservation();
    Reservation retrieveReservationById(long id);
    Reservation updateReservation(Reservation reservation);
}