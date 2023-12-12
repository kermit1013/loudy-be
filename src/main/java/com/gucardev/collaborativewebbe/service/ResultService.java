package com.gucardev.collaborativewebbe.service;

import com.gucardev.collaborativewebbe.model.Result;
import com.gucardev.collaborativewebbe.repository.ResultRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class ResultService {
    private final ResultRepository resultRepo;


    public ResultService(ResultRepository resultRepo) {
        this.resultRepo = resultRepo;
    }
    public Result create(Result result) {
        result.setCreatedAt(new Date().toString());
        log.info("result saved");
        return resultRepo.save(result);
    }

}
