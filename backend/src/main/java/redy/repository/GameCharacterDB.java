package redy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import redy.entity.character.GameCharacter;

@Repository
public interface GameCharacterDB extends MongoRepository<GameCharacter, String>{
    
}
