package com.example.apiapi.Services;

import com.example.apiapi.Repositories.AutorRepository;
import com.example.apiapi.Repositories.BaseRepository;
import com.example.apiapi.Entities.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository=autorRepository;
    }

}
