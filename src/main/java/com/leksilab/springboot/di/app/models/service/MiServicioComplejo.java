package com.leksilab.springboot.di.app.models.service;

// import org.springframework.context.annotation.Primary;
// import org.springframework.stereotype.Component;

// @Component("miServicioComplejo")
// @Primary
public class MiServicioComplejo implements IServicio {

    public String operacion(){
        return "ejecuta algun proceso importante complejo...";
    }

}
