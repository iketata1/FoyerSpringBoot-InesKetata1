package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.IServices.IFoyerService;
import tn.esprit.foyerspringboot.entities.Foyer;
import tn.esprit.foyerspringboot.repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImplement implements IFoyerService {

    FoyerRepository FoyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return FoyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return FoyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long id) {
        FoyerRepository.deleteById(id);
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return FoyerRepository.findAll();
    }

    @Override
    public Foyer getFoyerById(Long id) {
        return FoyerRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        FoyerRepository.deleteById(id);
    }
}
