package com.knowledgebase.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.knowledgebase.org.domain.Content;

@Repository
public interface ContentRepository extends CrudRepository<Content,Long>{
}