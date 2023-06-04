package com.example.resthttp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.resthttp.Entity.MottaEntidade;

@RestController
public class MottaControlador {

    private Long counter = 0L;
    @RequestMapping("/motta")
    public MottaEntidade motta(@RequestParam(value = "name") String name){ 
        counter++;
        return new MottaEntidade(name, counter, 18);
            
}
}
