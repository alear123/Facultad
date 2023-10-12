package com.example.apiapi.Services;

import com.example.apiapi.Entities.Persona;
import com.example.apiapi.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{
    public List<Persona> search (String filtro)throws Exception;
    public Page<Persona> search (String filtro, Pageable pageble)throws Exception;



}
