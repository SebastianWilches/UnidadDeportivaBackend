package UD.UnidadDeportiva.Controlador;

import UD.UnidadDeportiva.DTO.PersonalDTO;
import UD.UnidadDeportiva.Modelo.Cargo;
import UD.UnidadDeportiva.Modelo.Personal;
import UD.UnidadDeportiva.Modelo.Sede;
import UD.UnidadDeportiva.Servicio.CargoServicio;
import UD.UnidadDeportiva.Servicio.PersonalServicio;
import UD.UnidadDeportiva.Servicio.SedeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controlador de rutas que hace uso de los servicios

@RestController
@RequestMapping("/Personal")
public class PersonalControlador {
    @Autowired
    private PersonalServicio personalServicio;

    @GetMapping("/getPersonal")
    public List<Personal> getPersonal(){
        return personalServicio.getPersonal();
    }


    //Servicios de las FK
    @Autowired
    private SedeServicio sedeServicio;

    @Autowired
    private CargoServicio cargoeServicio;

    @Autowired
    private PersonalServicio empleadoServicio;

    @PostMapping("/save") //METODO POST
    public Personal save(@RequestBody PersonalDTO personalDTO){
        Personal personal= new Personal();
        personal = personalDTO.getPersonal(personalDTO);
        //Llaves foraneas
        personal.setSede(sedeServicio.findById(personalDTO.getIdSede()));
        personal.setCargo(cargoeServicio.findById(personalDTO.getIdCargo()));
        return personalServicio.save(personal);
    }

    @PutMapping("/update") //Metodo PUT
    public Personal update(@RequestBody PersonalDTO personalDTO){
        return save(personalDTO);
    }

}
