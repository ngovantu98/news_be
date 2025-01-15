package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.entity.NewsSummary;
import java.util.List;

public interface INewsSummaryRepository extends JpaRepository<NewsSummary, Integer> {
	List<NewsSummary> findByType(String type);

}
