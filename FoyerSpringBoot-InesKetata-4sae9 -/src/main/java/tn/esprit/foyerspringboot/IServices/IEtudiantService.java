package tn.esprit.foyerspringboot.IServices;

import tn.esprit.foyerspringboot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long id);
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(Long id);
    void deleteById(Long id);
}
