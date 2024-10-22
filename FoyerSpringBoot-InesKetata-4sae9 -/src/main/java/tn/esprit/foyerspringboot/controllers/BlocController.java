package tn.esprit.foyerspringboot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.IServices.IBlocService;
import tn.esprit.foyerspringboot.entities.Bloc;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {
    IBlocService blocService;

    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc b){
        return blocService.addBloc(b);
    }

    @GetMapping("/findAll")
    List<Bloc> findAll(){
        return blocService.getAllBlocs();
    }

    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc b){
        return blocService.updateBloc(b);
    }

    @DeleteMapping("/deleteBloc/{id}")
    void deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }

    @GetMapping("/findBlocById/{id}")
    Bloc findBlocById(@PathVariable Long id) {
        return blocService.findBlocById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    void deleteById(@PathVariable Long id) {
        blocService.deleteById(id);
    }
}
