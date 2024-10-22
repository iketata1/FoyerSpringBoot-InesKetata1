package tn.esprit.foyerspringboot.IServices;

import tn.esprit.foyerspringboot.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(Long id);
    List<Foyer> getAllFoyers();

    Foyer getFoyerById(Long id);
    void deleteById(Long id);
}
