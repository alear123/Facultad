package com.example.apiapi.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends Base{
    @Column(name="calle")
    private String calle;
    @Column(name="numero")
    private int numero;
    @ManyToOne(optional = false)
    @JoinColumn(name="fk-localidad")
    private Localidad localidad;
}
