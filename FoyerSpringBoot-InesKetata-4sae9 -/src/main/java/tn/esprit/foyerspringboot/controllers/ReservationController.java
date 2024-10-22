package tn.esprit.foyerspringboot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.IServices.IReservationService;
import tn.esprit.foyerspringboot.entities.Reservation;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/addReservation")
    void addReservation(@RequestBody Reservation r){
        reservationService.addReservation(r);
    }

    @GetMapping("/findAll")
    List<Reservation> findAll(){
        return reservationService.getAllReservations();
    }

    @PutMapping("/updateReservation")
    void updateReservation(@RequestBody Reservation r){
        reservationService.updateReservation(r);
    }

    @DeleteMapping("/deleteReservation/{id}")
    void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }

    @GetMapping("/findReservationById/{id}")
    Reservation findReservationById(@PathVariable Long id){
        return reservationService.getReservationById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    void deleteById(@PathVariable Long id){
        reservationService.deleteById(id);
    }
}
