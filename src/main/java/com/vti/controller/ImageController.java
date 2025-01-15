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
import com.vti.dto.ImageDTO;
import com.vti.entity.Image;
import com.vti.form.ImageFormCreate;
import com.vti.service.IImageService;

@RestController
@RequestMapping(value = "api/v1/images")
public class ImageController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IImageService service;

	@GetMapping()
	public List<ImageDTO> getAllImages() {
		List<Image> entities = service.getAllImages();

		// convert entities --> dtos
		List<ImageDTO> dtos = modelMapper.map(entities, new TypeToken<List<ImageDTO>>(){}.getType());

		return dtos;
	}

	@PostMapping()
	public ResponseEntity<String> createImage(@RequestBody ImageFormCreate form) {
		service.createImage(form);
		return new ResponseEntity<String>("Tạo mới ảnh thành công!", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public void updateImage(@PathVariable(name = "id") int id, @RequestBody ImageFormCreate form) {
		Image image = form.toEntity();
		image.setId(id);
		service.updateImage(image);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteImage(@PathVariable(name = "id") int id) {
		service.deleteImage(id);
	}
}
