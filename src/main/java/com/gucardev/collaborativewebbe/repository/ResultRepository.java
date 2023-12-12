package com.gucardev.collaborativewebbe.repository;

import com.gucardev.collaborativewebbe.model.Project;
import com.gucardev.collaborativewebbe.model.Result;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResultRepository extends MongoRepository<Result,String>  {
}

