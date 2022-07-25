package UD.UnidadDeportiva.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cargo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    @Id
    @Column
    private String idcargo;
    private String nom_cargo;


}
