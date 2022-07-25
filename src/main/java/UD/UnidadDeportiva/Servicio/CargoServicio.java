package UD.UnidadDeportiva.Servicio;

import UD.UnidadDeportiva.Modelo.Cargo;
import UD.UnidadDeportiva.Repositorio.CargoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoServicio {
    @Autowired
    private CargoRepositorio cargoRepositorio;

    public List<Cargo> getCargos(){
        return cargoRepositorio.findAll();
    }

    public Cargo save(Cargo cargo){
        return cargoRepositorio.save(cargo);
    }


    public Cargo findById(String idCargo){
        return cargoRepositorio.findById(idCargo).get();
    }
}
