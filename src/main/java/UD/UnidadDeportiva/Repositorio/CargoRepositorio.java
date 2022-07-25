package UD.UnidadDeportiva.Repositorio;

import UD.UnidadDeportiva.Modelo.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepositorio extends JpaRepository<Cargo, String> {
}
