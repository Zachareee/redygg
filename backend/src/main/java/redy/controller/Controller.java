package redy.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import redy.entity.*;
import redy.entity.character.GameCharacter;
import redy.service.*;

@RestController
@AllArgsConstructor
public class Controller {
    private CharaService charaService;
    private SeriesService seriesService;

    @GetMapping
    public String health_check() {
        return "Service is running";
    }

    @GetMapping("/characters")
    public List<GameCharacter> getAllCharacters() {
        return charaService.getAllCharas();
    }

    @GetMapping("/series")
    public List<Series> getAllSeries() {
        return seriesService.getAllSeries();
    }
}
