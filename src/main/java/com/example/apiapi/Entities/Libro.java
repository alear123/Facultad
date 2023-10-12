package com.example.apiapi.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro extends Base{
    @Column(name="fecha")
    private Date fecha;
    @Column(name="genero")
    private String genero;
    @Column(name="paginas")
    private int paginas;
    @Column(name="titulo")
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
