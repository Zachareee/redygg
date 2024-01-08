package redy.entity;

import java.util.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LegoGame extends Game {
    private Map<String, Map<String, Image>> map;
}
