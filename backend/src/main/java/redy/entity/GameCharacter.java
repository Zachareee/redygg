package redy.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.*;

@Document
@Data
public class GameCharacter {
    @Id
    @NotNull
    private String name;
    private Image headshot;
    private List<Game> game_appearances;
    private Map<String, Image> alternatives;
}
