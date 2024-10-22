package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.IServices.IReservationService;
import tn.esprit.foyerspringboot.entities.Reservation;
import tn.esprit.foyerspringboot.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImplement implements IReservationService {

    ReservationRepository ReservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return ReservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return ReservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        ReservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return ReservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        return ReservationRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        ReservationRepository.deleteById(id);
    }
}
