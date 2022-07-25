package UD.UnidadDeportiva.Repositorio;

import UD.UnidadDeportiva.Modelo.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepositorio extends JpaRepository<Personal, String> {
}
