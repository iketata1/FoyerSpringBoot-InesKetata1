package tn.esprit.foyerspringboot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.IServices.IEtudiantService;
import tn.esprit.foyerspringboot.entities.Etudiant;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }

    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return etudiantService.getAllEtudiants();
    }

    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant e){
        return etudiantService.updateEtudiant(e);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    void deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
    }

    @GetMapping("/findEtudiantById/{id}")
    Etudiant findEtudiantById(@PathVariable Long id){
        return etudiantService.getEtudiantById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    void deleteById(@PathVariable Long id) {
        etudiantService.deleteById(id);
    }
}
