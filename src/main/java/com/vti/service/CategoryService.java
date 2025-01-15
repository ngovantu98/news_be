package com.vti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vti.entity.Category;
import com.vti.form.CategoryFormCreate;
import com.vti.repository.ICategoryRepository;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private ICategoryRepository repository;

	public List<Category> getAllCategorys() {
		return repository.findAll();
	}

	public Category getCategoryByID(int id) {
		return repository.findById(id).get();
	}

	public void createCategory(CategoryFormCreate from) {
		repository.save(from.toEntity());
	}

	public void updateCategory(Category category) {
		repository.save(category);
	}

	public void deleteCategory(int id) {
		repository.deleteById(id);
	}

	public boolean isCategoryExistsByID(int id) {
		return repository.existsById(id);
	}


}
