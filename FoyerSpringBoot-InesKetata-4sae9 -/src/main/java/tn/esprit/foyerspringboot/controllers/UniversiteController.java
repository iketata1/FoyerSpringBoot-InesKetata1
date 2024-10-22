package tn.esprit.foyerspringboot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.IServices.IUniversiteService;
import tn.esprit.foyerspringboot.entities.Universite;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return universiteService.addUniversite(u);
    }

    @GetMapping("/findAll")
    List<Universite> findAll(){
        return universiteService.getAllUniversites();
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite u){
        return universiteService.updateUniversite(u);
    }

    @DeleteMapping("/deleteUniversite/{id}")
    void deleteUniversite(@PathVariable Long id){
        universiteService.deleteUniversite(id);
    }

    @GetMapping("/findUniversiteById/{id}")
    Universite findUniversiteById(@PathVariable Long id){
        return universiteService.getUniversiteById(id);
    }

    @DeleteMapping("/deleteUniversiteById/{id}")
    void deleteUniversiteById(@PathVariable Long id){
        universiteService.deleteById(id);
    }
}
