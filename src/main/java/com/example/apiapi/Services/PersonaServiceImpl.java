package com.example.apiapi.Services;

import com.example.apiapi.Repositories.BaseRepository;
import com.example.apiapi.Repositories.PersonaRepository;
import com.example.apiapi.Entities.Persona;
import com.example.apiapi.Services.BaseServiceImpl;
import com.example.apiapi.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {
    @Autowired //es para acceder a todos los metodos de PersonaRepository
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            //List<Persona> personas=personaRepository.findByNombreContainingOrApellidoContaining(filtro,filtro);
            //List<Persona> personas= personaRepository.search(filtro);
            List<Persona> personas= personaRepository.searchNative(filtro);
            return personas;
        }catch (Exception e){
        throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona> personas=personaRepository.findByNombreContainingOrApellidoContaining(filtro,filtro, pageable);
            //Page<Persona> personas= personaRepository.search(filtro, pageable);
            Page<Persona> personas= personaRepository.searchNative(filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}