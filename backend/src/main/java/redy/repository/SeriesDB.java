package redy.repository;

import redy.entity.Series;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeriesDB extends MongoRepository<Series, String> {
    
}
