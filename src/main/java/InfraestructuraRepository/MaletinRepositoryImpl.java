package InfraestructuraRepository;

import Domain.Maletin;
import Interfaces.MaletinRepository;

import java.util.ArrayList;
import java.util.List;

public class MaletinRepositoryImpl implements MaletinRepository {

    private List<Maletin> maletines;

    public MaletinRepositoryImpl() {
        maletines = new ArrayList<>();
    }

    @Override
    public void crear(Maletin maletin) {
        maletines.add(maletin);
    }

    @Override
    public void actualizar(Maletin maletin) {
        for (int i = 0; i < maletines.size(); i++) {
            if (maletines.get(i).getId() == maletin.getId()) {
                maletines.set(i, maletin);
                return;
            }
        }
    }

    @Override
    public void eliminar(int id) {
        for (int i = 0; i < maletines.size(); i++) {
            if (maletines.get(i).getId() == id) {
                maletines.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Maletin> consultar() {
        return new ArrayList<>(maletines);
    }
}
