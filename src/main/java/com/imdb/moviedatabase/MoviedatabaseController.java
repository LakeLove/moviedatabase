package com.imdb.moviedatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/api/moviedatabase")
public class MoviedatabaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MoviedatabaseController.class);

    @Autowired
    private MoviedatabaseService moviedatabaseService;


    @GetMapping (value = "/all")
    @ResponseBody public String getAll() {
        try {
            return moviedatabaseService.getAll();
        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return null;
    }

    @PostMapping (value = "/add")
    @ResponseBody MoviedatabaseEntity addNewMovie(@RequestBody MoviedatabaseEntity moviedatabaseEntity) {
        try {
            return moviedatabaseService.addNewMovie(moviedatabaseEntity);
        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return null;
    }
}
