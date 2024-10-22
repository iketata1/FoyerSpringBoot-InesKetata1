package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.IServices.IUniversiteService;
import tn.esprit.foyerspringboot.entities.Universite;
import tn.esprit.foyerspringboot.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImplement implements IUniversiteService {

    UniversiteRepository UniversiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return UniversiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return UniversiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long id) {
        UniversiteRepository.deleteById(id);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return UniversiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteById(Long id) {
        return UniversiteRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        UniversiteRepository.deleteById(id);
    }
}
