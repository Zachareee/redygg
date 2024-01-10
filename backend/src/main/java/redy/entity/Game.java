package redy.entity;

import redy.entity.character.*;

import java.util.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @NotBlank
    protected String name;
    protected String description;
    @NotNull
    protected Date released;
    protected Image thumbnail;
    protected Collection<@Valid Level> levels;
    protected Collection<@Valid CharacterVariant> character_list;

    public Game addLevel(Level level) {
        levels.add(level);
        return this;
    }

    public Game addCharacter(CharacterVariant var) {
        character_list.add(var);
        return this;
    }
}
