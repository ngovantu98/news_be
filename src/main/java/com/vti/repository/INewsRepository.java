package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.entity.News;

public interface INewsRepository extends JpaRepository<News, Integer> {

}
