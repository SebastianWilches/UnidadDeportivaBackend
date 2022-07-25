package UD.UnidadDeportiva.Controlador;

import UD.UnidadDeportiva.Modelo.Sede;
import UD.UnidadDeportiva.Servicio.SedeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controlador de rutas que hace uso de los servicios

@RestController
@RequestMapping("/Sede")
public class SedeControlador {
    @Autowired
    private SedeServicio sedeService;

    @GetMapping("/getSedes")
    public List<Sede> getSedes(){
        return sedeService.getSedes();
    }
}
