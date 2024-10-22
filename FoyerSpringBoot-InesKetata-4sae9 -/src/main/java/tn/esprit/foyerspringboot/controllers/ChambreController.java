package tn.esprit.foyerspringboot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.IServices.IChambreService;
import tn.esprit.foyerspringboot.entities.Chambre;
import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }

    @GetMapping("/findAll")
    List<Chambre> findAll(){
        return chambreService.getAllChambres();
    }

    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre c){
        return chambreService.updateChambre(c);
    }

    @DeleteMapping("/deleteChambre/{id}")
    void deleteChambre(@PathVariable Long id){
        chambreService.deleteChambre(id);
    }

    @GetMapping("/findChambreById/{id}")
    Chambre findChambreById(@PathVariable Long id){
        return chambreService.findById(id);
    }

    @DeleteMapping("/deleteChambreById/{id}")
    void deleteChambreById(@PathVariable Long id){
        chambreService.deleteById(id);
    }
}
