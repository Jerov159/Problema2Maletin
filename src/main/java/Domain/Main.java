package Domain;

import Aplication.Service.MaletinServiceImpl;
import Domain.Maletin;
import InfraestructuraRepository.MaletinRepositoryImpl;
import Interfaces.MaletinRepository;
import Interfaces.MaletinService;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del repositorio
        MaletinRepository maletinRepository = new MaletinRepositoryImpl();

        // Crear instancia del servicio e inyectar el repositorio
        MaletinService maletinService = new MaletinServiceImpl(maletinRepository);

        // Crear algunos maletines
        Maletin maletin1 = new Maletin(1, "Samsonite", 99.99, "Negocios");
        Maletin maletin2 = new Maletin(2, "Nike", 59.99, "Deporte");

        // Crear maletines
        maletinService.crear(maletin1);
        maletinService.crear(maletin2);

        // Consultar maletines
        System.out.println("Maletines:");
        for (Maletin maletin : maletinService.consultar()) {
            System.out.println(maletin);
        }

        // Actualizar un maletín
        Maletin maletinActualizado = new Maletin(2, "Adidas", 69.99, "Deporte");
        maletinService.actualizar(maletinActualizado);

        // Consultar maletines nuevamente
        System.out.println("\nMaletines después de actualizar:");
        for (Maletin maletin : maletinService.consultar()) {
            System.out.println(maletin);
        }

        // Eliminar un maletín
        maletinService.eliminar(1);

        // Consultar maletines nuevamente
        System.out.println("\nMaletines después de eliminar:");
        for (Maletin maletin : maletinService.consultar()) {
            System.out.println(maletin);
        }
    }
}
