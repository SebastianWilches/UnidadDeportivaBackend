package UD.UnidadDeportiva.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sede")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sede {
    @Id
    @Column
    private String idsede;
    private String nom_sede;
    private String direccion_sede;


}
