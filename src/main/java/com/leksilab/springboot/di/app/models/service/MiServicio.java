package com.leksilab.springboot.di.app.models.service;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;

//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio {

    public String operacion(){
        return "ejecuta algun proceso importante simple...";
    }

}
