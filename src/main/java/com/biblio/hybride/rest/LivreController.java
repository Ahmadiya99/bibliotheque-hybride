package com.biblio.hybride.rest;

import com.biblio.hybride.model.Livre;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/livres")
public class LivreController {
    @GetMapping
    public List<Livre> getLivres() {
        return Arrays.asList(
                new Livre(1L, "Le Java", "John Doe"),
                new Livre(2L, "Spring Boot", "Jane Doe")
        );
    }

    @PostMapping
    public Livre createLivre(@RequestBody Livre livre) {
        return livre;
    }
}