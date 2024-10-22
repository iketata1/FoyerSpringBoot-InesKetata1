package tn.esprit.foyerspringboot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.IServices.IFoyerService;
import tn.esprit.foyerspringboot.entities.Foyer;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    IFoyerService foyerService;

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer f){
        return foyerService.addFoyer(f);
    }

    @GetMapping("/findAll")
    List<Foyer> findAll(){
        return foyerService.getAllFoyers();
    }

    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer f){
        return foyerService.updateFoyer(f);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
    }

    @GetMapping("/findFoyerById/{id}")
    Foyer findFoyerById(@PathVariable Long id){
        return foyerService.getFoyerById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    void deleteById(@PathVariable Long id) {
        foyerService.deleteById(id);
    }
}
