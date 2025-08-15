package co.edu.ucentral.manejadorUniveridades.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "productostecnologicos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductoTecnologico {
@Id
private long codigo;
private String nombre;
private String descripcion;
private double precio;
private String paisOrigen;
private boolean disponibilidad;
}
