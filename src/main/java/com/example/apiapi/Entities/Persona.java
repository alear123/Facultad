package com.example.apiapi.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@audited
public class Persona extends Base{
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private int dni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk-Domicilio")
    private Domicilio domicilio;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable( name= "persona-id",
            joinColumns=@JoinColumn(name= "persona-id"),
            inverseJoinColumns = @JoinColumn(name="libro-id")
    )
    private List<Libro> libros= new ArrayList<Libro>();
}
