package br.com.italo.cambioservice.web;

import br.com.italo.cambioservice.entity.Cambio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/cambio")
public class CambioResource {

    @GetMapping
    @RequestMapping(value = "{amount}/{from}/{to}" )
    public Cambio getCambio(
            @PathVariable("amount") BigDecimal amount,
            @PathVariable("from") String from,
            @PathVariable("to") String to){
        return new Cambio();
    }
}
