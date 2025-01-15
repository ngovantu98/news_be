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
import com.vti.dto.NewsDTO;
import com.vti.entity.News;
import com.vti.form.NewsFormCreate;
import com.vti.service.INewsService;

@RestController
@RequestMapping(value = "api/v1/newss")
public class NewsController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private INewsService service;

	@GetMapping()
	public List<NewsDTO> getAllNewss() {
		List<News> entities = service.getAllNewss();

		// convert entities --> dtos
		List<NewsDTO> dtos = modelMapper.map(entities, new TypeToken<List<NewsDTO>>() {
		}.getType());

		return dtos;
	}


	@GetMapping(value = "/{id}")
	public News getNewsByID(@PathVariable(name = "id") int id) {
		return service.getNewsByID(id);
	}

	@PostMapping()
	public ResponseEntity<String> createNews(@RequestBody NewsFormCreate form) {
		service.createNews(form);
		return new ResponseEntity<String>("Tạo mới tin tức thành công!", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public void updateNews(@PathVariable(name = "id") int id, @RequestBody NewsFormCreate form) {
		News news = form.toEntity();
		news.setId(id);
		service.updateNews(news);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteNews(@PathVariable(name = "id") int id) {
		service.deleteNews(id);
		
	}

}
