package redy.entity.character;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import redy.entity.Image;

import java.util.*;

@Document
@Data
public class GameCharacter {
    @Id
    @NotNull
    private String name;
    private Image headshot;
    private Collection<CharacterVariant> variants;

    public GameCharacter addCharacterVariant(CharacterVariant var) {
        variants.add(var);
        return this;
    }
}
