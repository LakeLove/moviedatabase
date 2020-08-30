package com.imdb.moviedatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviedatabaseService {

    private MoviedatabaseRepository moviedatabaseRepository;

    @Autowired
    public MoviedatabaseService(MoviedatabaseRepository moviedatabaseRepository) {
        this.moviedatabaseRepository = moviedatabaseRepository;
    }

    public List<MoviedatabaseEntity> findAll() {
      return moviedatabaseRepository.findAll();
    }

    public Optional<MoviedatabaseEntity> findById(Long id) {
        return moviedatabaseRepository.findById(id);
    }

    public String getAll() {
        return "Hello database";
    }

    public MoviedatabaseEntity addNewMovie(MoviedatabaseEntity moviedatabaseEntity) {
        return moviedatabaseRepository.save(moviedatabaseEntity);
    }
}
