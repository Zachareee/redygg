package redy.entity;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Level {
    @NotNull
    private String name;
}
