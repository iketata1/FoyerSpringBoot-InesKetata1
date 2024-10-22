package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entities.Bloc;
import tn.esprit.foyerspringboot.repositories.BlocRepository;
import tn.esprit.foyerspringboot.IServices.IBlocService;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImplement implements IBlocService{

    BlocRepository BlocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return BlocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return BlocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long id) {
        BlocRepository.deleteById(id);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return BlocRepository.findAll();
    }

    @Override
    public Bloc findBlocById(Long id) {
        return BlocRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        BlocRepository.deleteById(id);
    }
}
