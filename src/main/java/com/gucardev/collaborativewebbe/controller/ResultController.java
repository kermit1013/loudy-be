package com.gucardev.collaborativewebbe.controller;


import com.gucardev.collaborativewebbe.model.Result;
import com.gucardev.collaborativewebbe.repository.ResultRepository;
import com.gucardev.collaborativewebbe.service.ResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/result")
@CrossOrigin
public class ResultController {
    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }


    @PostMapping
    public ResponseEntity<Result> postResult(@RequestBody Result result) {
        resultService.create(result);
        return ResponseEntity.ok(result);
    }

}
