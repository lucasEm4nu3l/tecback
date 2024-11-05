package br.com.fujideia.iesp.tecback.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    @Cacheable("genres")
    public List<String> getAllGenres() {
        // Simula a busca de gêneros em uma fonte externa
        System.out.println("Fetching genres from database or external API...");
        return List.of("Action", "Comedy", "Drama", "Horror", "Romance");
    }
}
