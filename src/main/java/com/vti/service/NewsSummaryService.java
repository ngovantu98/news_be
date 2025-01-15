package com.vti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vti.entity.NewsSummary;
import com.vti.form.NewsSummaryFormCreate;
import com.vti.repository.INewsSummaryRepository;

@Service
public class NewsSummaryService implements INewsSummaryService {

	@Autowired
	private INewsSummaryRepository repository;

	public List<NewsSummary> getAllNewsSummarys() {
		return repository.findAll();
	}

	public NewsSummary getNewsSummaryByID(int id) {
		return repository.findById(id).get();
	}

	public void createNewsSummary(NewsSummaryFormCreate from) {
		repository.save(from.toEntity());
	}

	public void updateNewsSummary(NewsSummary newsSummary) {
		repository.save(newsSummary);
	}

	public void deleteNewsSummary(int id) {
		repository.deleteById(id);
	}

	public boolean isNewsSummaryExistsByID(int id) {
		return repository.existsById(id);
	}

	public List<NewsSummary> getNewsSummaryByType(String type) {
		return repository.findByType(type);
	}

}
