package com.A1.Task3.repos;

import com.A1.Task3.domain.PostingsA1;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostingsRepo extends CrudRepository<PostingsA1, Long> {
    List<PostingsA1> findByAuthPosting(boolean isAuthPosting);
}
