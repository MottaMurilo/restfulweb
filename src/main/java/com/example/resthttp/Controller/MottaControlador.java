package com.example.resthttp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resthttp.Entity.MottaEntidade;

@RestController
public class MottaControlador {

    @RequestMapping("/motta")
    public MottaEntidade motta(){
        return new MottaEntidade("murilo", 1L, 18);

}
}
