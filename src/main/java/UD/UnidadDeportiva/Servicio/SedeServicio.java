package UD.UnidadDeportiva.Servicio;

import UD.UnidadDeportiva.Modelo.Sede;
import UD.UnidadDeportiva.Repositorio.SedeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeServicio {
    @Autowired
    private SedeRepositorio sedeRepositorio;

    public List<Sede> getSedes(){
        return sedeRepositorio.findAll();
    }

    public Sede save(Sede sede){
        return sedeRepositorio.save(sede);
    }

    public Sede findById(String idSede){
        return sedeRepositorio.findById(idSede).get();
    }
}
