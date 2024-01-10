package redy.entity.character;

import java.util.*;

import lombok.*;

@Data
@AllArgsConstructor
public class CharacterVariant {
    private Collection<Costume> costumes;

    public CharacterVariant addCostume(Costume cos) {
        costumes.add(cos);
        return this;
    }
}
