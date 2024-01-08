package redy.entity;

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
    protected List<@Valid Level> levels;
    private List<@Valid GameCharacter> character_list;
}
