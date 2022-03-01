package com.leksilab.springboot.di.app.controllers;

import com.leksilab.springboot.di.app.models.service.IServicio;
//import com.leksilab.springboot.di.app.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    // sin inyeccion de dependencias
    // private MiServicio servicio = new MiServicio();
    // Con inyeccion de dependencias
    @Autowired
//    private MiServicio servicio;
    // @Qualifier("miServicioComplejo")
    private IServicio servicio;

    /*@Autowired // utilizando contructoe se puede omitir el autowire
    public IndexController(IServicio servicio) {
        this.servicio = servicio;
    }*/

    @GetMapping({"/", "", "/index"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

    /*@Autowired
    public void setServicio(IServicio servicio) {
        this.servicio = servicio;
    }*/
}
