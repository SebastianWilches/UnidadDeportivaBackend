package UD.UnidadDeportiva.Servicio;

import UD.UnidadDeportiva.Modelo.Personal;
import UD.UnidadDeportiva.Repositorio.PersonalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServicio {
    @Autowired
    private PersonalRepositorio personalRepositorio;

    public List<Personal> getPersonal(){
        return personalRepositorio.findAll();
    }

    public Personal save(Personal personal){
        return personalRepositorio.save(personal);
    }
}
