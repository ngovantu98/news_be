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
import com.vti.dto.NewsSummaryDTO;
import com.vti.entity.NewsSummary;
import com.vti.form.NewsSummaryFormCreate;
import com.vti.service.INewsSummaryService;

@RestController
@RequestMapping(value = "api/v1/newsSummarys")
public class NewsSummaryController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private INewsSummaryService service;

	@GetMapping()
	public List<NewsSummaryDTO> getAllNewsSummarys() {
		List<NewsSummary> entities = service.getAllNewsSummarys();

		// convert entities --> dtos
		List<NewsSummaryDTO> dtos = modelMapper.map(entities, new TypeToken<List<NewsSummaryDTO>>() {
		}.getType());

		return dtos;
	}


	@GetMapping(value = "/{id}")
	public NewsSummary getNewsSummaryByID(@PathVariable(name = "id") int id) {
		return service.getNewsSummaryByID(id);
	}

	@PostMapping()
	public ResponseEntity<String> createNewsSummary(@RequestBody NewsSummaryFormCreate form) {
		service.createNewsSummary(form);
		return new ResponseEntity<String>("Tạo mới tin tức thành công!", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public void updateNewsSummary(@PathVariable(name = "id") int id, @RequestBody NewsSummaryFormCreate form) {
		NewsSummary newsSummary = form.toEntity();
		newsSummary.setId(id);
		
		service.updateNewsSummary(newsSummary);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteNewsSummary(@PathVariable(name = "id") int id) {
		service.deleteNewsSummary(id);
		
	}
	
	@GetMapping(value = "/type/{type}")
	public List<NewsSummaryDTO> getNewsSummaryByType(@PathVariable(name = "type") String type) {
		List<NewsSummary> entities = service.getNewsSummaryByType(type);
		
		List<NewsSummaryDTO> dtos = modelMapper.map(entities, new TypeToken<List<NewsSummaryDTO>>() {
			}.getType());
	
			return dtos;
		}

}
