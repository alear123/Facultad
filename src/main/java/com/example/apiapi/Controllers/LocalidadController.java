package com.example.apiapi.Controllers;

import com.example.apiapi.Controllers.BaseControllerImpl;
import com.example.apiapi.Services.LocalidadService;
import com.example.apiapi.Services.LocalidadServiceImpl;
import com.example.apiapi.Entities.Localidad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
