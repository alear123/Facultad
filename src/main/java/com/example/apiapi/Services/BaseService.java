package com.example.apiapi.Services;

import com.example.apiapi.Entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable>{

    //nos trae una lista de todas las entidades del tipo E
    public List<E> findAll() throws Exception;
    //busca una entidad segun un Id que mandemos como parametro
    public E findById(ID id)throws Exception ;
    //crea una nueva entidad
    public E save(E entity)throws Exception ;
    //va devolver la entidad actulizada, recibiendo el id y el tipo de entidad a actualizar
    public E update(ID id,E entity)throws Exception ;
    //elimina registros de la base de datos
    public Boolean delete(ID id)throws Exception ;
    //paginacion
    public Page<E> findAll(Pageable pageable)throws Exception;

}