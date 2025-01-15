package com.vti.controller;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vti.dto.CategoryDTO;
import com.vti.entity.Category;
import com.vti.form.CategoryFormCreate;
import com.vti.service.ICategoryService;

@RestController
@RequestMapping(value = "api/v1/categorys")
public class CategoryController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ICategoryService service;

	@GetMapping()
	public List<CategoryDTO> getAllCategorys() {
		List<Category> entities = service.getAllCategorys();

		// convert entities --> dtos
		List<CategoryDTO> dtos = modelMapper.map(entities, new TypeToken<List<CategoryDTO>>(){}.getType());

		return dtos;
	}

	@PostMapping()
	public ResponseEntity<String> createCategory(@RequestBody CategoryFormCreate form) {
		service.createCategory(form);
		return new ResponseEntity<String>("Tạo mới loại tin tức thành công!", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public void updateCategory(@PathVariable(name = "id") int id, @RequestBody CategoryFormCreate form) {
		Category category = form.toEntity();
		category.setId(id);
		service.updateCategory(category);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteCategory(@PathVariable(name = "id") int id) {
		service.deleteCategory(id);
	}
}
