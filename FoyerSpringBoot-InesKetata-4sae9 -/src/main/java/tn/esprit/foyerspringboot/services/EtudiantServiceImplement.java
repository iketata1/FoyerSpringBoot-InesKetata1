package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.IServices.IEtudiantService;
import tn.esprit.foyerspringboot.entities.Etudiant;
import tn.esprit.foyerspringboot.repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImplement implements IEtudiantService {

    EtudiantRepository EtudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return EtudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return EtudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long id) {
        EtudiantRepository.deleteById(id);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return EtudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return EtudiantRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        EtudiantRepository.deleteById(id);
    }
}
