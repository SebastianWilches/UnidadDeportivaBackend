package UD.UnidadDeportiva.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Personal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal {
    @Id
    @Column
    private String idpersonal;
    @ManyToOne
    @JoinColumn(name = "idcargo_fkpersonal")
    private Cargo cargo; //FK
    @ManyToOne
    @JoinColumn(name = "idsede_fkpersonal")
    private Sede sede; //FK
    private String nom_personal;
    private String apellido1_personal;
    private String apellido2_personal;
    private Date fechanacimiento_personal;
    private int telefono_usuario;


}

