package UD.UnidadDeportiva.Repositorio;

import UD.UnidadDeportiva.Modelo.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepositorio extends JpaRepository<Sede, String> {
}
