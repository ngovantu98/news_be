package com.vti.service;

import java.util.List;
import com.vti.entity.Category;
import com.vti.form.CategoryFormCreate;

public interface ICategoryService {

	public List<Category> getAllCategorys();

	public Category getCategoryByID(int id);

	public void createCategory(CategoryFormCreate from);

	public void updateCategory(Category category);

	public void deleteCategory(int id);

	public boolean isCategoryExistsByID(int id);




}
