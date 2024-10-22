package tn.esprit.foyerspringboot.IServices;
import tn.esprit.foyerspringboot.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long id);
    List<Bloc> getAllBlocs();
    Bloc findBlocById(Long id);
    void deleteById(Long id);
}
