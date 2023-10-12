package com.example.apiapi.Services;

import com.example.apiapi.Repositories.BaseRepository;
import com.example.apiapi.Repositories.LocalidadRepository;
import com.example.apiapi.Entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository,LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository=localidadRepository;

    }
}