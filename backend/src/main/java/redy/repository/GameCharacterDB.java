package redy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import redy.entity.GameCharacter;

public interface GameCharacterDB extends MongoRepository<GameCharacter, String>{
    
}
