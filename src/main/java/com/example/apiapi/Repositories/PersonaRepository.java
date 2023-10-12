package com.example.apiapi.Repositories;

import com.example.apiapi.Entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository extends BaseRepository<Persona,Long> {
//anotacion en el metodo de query

List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
Boolean existsBydni(int dni);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido,Pageable pageable);
//anotacion jpql con los parametros nombrados
@Query(value="SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro")String filtro);
    @Query(value="SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(@Param("filtro")String filtro,Pageable pageable);

    @Query(
            value="SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true)
    List<Persona> searchNative(@Param("filtro") String filtro);
    @Query(
            value="SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true,
            countQuery="SELECT count(*) FROM persona"
    )
    Page<Persona> searchNative(@Param("filtro") String filtro, Pageable pageable);

}
