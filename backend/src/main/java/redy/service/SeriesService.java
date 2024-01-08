package redy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import redy.entity.Series;
import redy.repository.SeriesDB;

@Service
@AllArgsConstructor
public class SeriesService {
    private SeriesDB seriesDB;

    public List<Series> getAllSeries() {
        return seriesDB.findAll();
    }
}
