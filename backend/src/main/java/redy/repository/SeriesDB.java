package redy.repository;

import redy.entity.Series;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesDB extends MongoRepository<Series, String> {
    
}
