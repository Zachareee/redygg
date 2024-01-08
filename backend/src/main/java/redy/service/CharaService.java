package redy.service;

import java.util.*;

import redy.entity.GameCharacter;
import redy.repository.GameCharacterDB;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CharaService {
    private GameCharacterDB charaDB;

    public List<GameCharacter> getAllCharas() {
        return charaDB.findAll();
    }
}
