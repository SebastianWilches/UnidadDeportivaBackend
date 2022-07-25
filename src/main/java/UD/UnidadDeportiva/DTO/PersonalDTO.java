package UD.UnidadDeportiva.DTO;

import UD.UnidadDeportiva.Modelo.Cargo;
import UD.UnidadDeportiva.Modelo.Personal;
import UD.UnidadDeportiva.Modelo.Sede;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDTO {

    private String idpersonal;
    private String idCargo; //FK
    private String idSede; //FK
    private String nom_personal;
    private String apellido1_personal;
    private String apellido2_personal;
    private String fechanacimiento_personal;
    private int telefono_usuario;

    public Personal getPersonal(PersonalDTO personalDTO){
        Personal personal = new Personal();

        //Atributos de la tabla (NO FORANEOS)
        personal.setIdpersonal(personalDTO.getIdpersonal());
        personal.setNom_personal(personalDTO.getNom_personal());
        personal.setApellido1_personal(personalDTO.getApellido1_personal());
        personal.setApellido2_personal(personalDTO.getApellido2_personal());
        personal.setFechanacimiento_personal(personalDTO.getFechanacimiento_personal());
        personal.setTelefono_usuario(personalDTO.getTelefono_usuario());
        return personal;
    }

}
