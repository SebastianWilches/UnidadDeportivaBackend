package UD.UnidadDeportiva.Controlador;

import UD.UnidadDeportiva.Modelo.Cargo;
import UD.UnidadDeportiva.Servicio.CargoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controlador de rutas que hace uso de los servicios

@RestController
@RequestMapping("/Cargo")
public class CargoControlador {
    @Autowired
    private CargoServicio cargoServicio;

    @GetMapping("/getCargos")
    public List<Cargo> getCargos(){
        return cargoServicio.getCargos();
    }
}
