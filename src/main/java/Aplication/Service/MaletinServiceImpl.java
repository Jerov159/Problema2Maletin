package Aplication.Service;


import Domain.Maletin;
import Interfaces.MaletinRepository;
import Interfaces.MaletinService;

import java.util.List;

public class MaletinServiceImpl implements MaletinService {
    private final MaletinRepository maletinRepository;

    public MaletinServiceImpl(MaletinRepository maletinRepository) {
        this.maletinRepository = maletinRepository;
    }

    @Override
    public void crear(Maletin maletin) {
        maletinRepository.crear(maletin);
    }

    @Override
    public void actualizar(Maletin maletin) {
            maletinRepository.actualizar(maletin);
    }

    @Override
    public void eliminar(int id) {
            maletinRepository.eliminar(id);
    }

    @Override
    public List<Maletin> consultar() {
        return maletinRepository.consultar();
    }
}
