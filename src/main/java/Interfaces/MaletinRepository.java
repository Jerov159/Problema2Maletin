package Interfaces;

import Domain.Maletin;

import java.util.List;

public interface MaletinRepository {
    void crear(Maletin maletin);
    void actualizar(Maletin maletin);
    void eliminar(int id);
    List<Maletin> consultar();

}
