package redy.entity;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

@Data
@Document
public class Series {
    @Id
    @NotBlank
    private String name;
    private String description;
    @NotNull
    private Collection<@Valid Game> gamelist;
    private Image thumbnail;
}
