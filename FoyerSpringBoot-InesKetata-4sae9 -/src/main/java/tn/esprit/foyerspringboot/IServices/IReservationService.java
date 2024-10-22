package tn.esprit.foyerspringboot.IServices;

import tn.esprit.foyerspringboot.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long id);
    void deleteById(Long id);
}
