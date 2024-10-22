package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.repositories.ChambreRepository;
import tn.esprit.foyerspringboot.IServices.IChambreService;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImplement implements IChambreService {

    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(Long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        chambreRepository.deleteById(id);
    }
}
