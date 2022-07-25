package UD.UnidadDeportiva.Controlador;

import UD.UnidadDeportiva.Modelo.Sede;
import UD.UnidadDeportiva.Servicio.SedeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public Sede save(@RequestBody Sede sede){
        return sedeService.save(sede);
    }
}
