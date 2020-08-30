package com.imdb.moviedatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface MoviedatabaseRepository extends JpaRepository<MoviedatabaseEntity, Long> {

    List<MoviedatabaseEntity> findAll();
    Optional<MoviedatabaseEntity> findById(Long id);

}
