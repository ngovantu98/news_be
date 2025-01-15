package com.vti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vti.entity.Image;
import com.vti.form.ImageFormCreate;
import com.vti.repository.IImageRepository;

@Service
public class ImageService implements IImageService {

	@Autowired
	private IImageRepository repository;

	public List<Image> getAllImages() {
		return repository.findAll();
	}

	public Image getImageByID(int id) {
		return repository.findById(id).get();
	}

	public void createImage(ImageFormCreate from) {
		repository.save(from.toEntity());
	}

	public void updateImage(Image image) {
		repository.save(image);
	}

	public void deleteImage(int id) {
		repository.deleteById(id);
	}

	public boolean isImageExistsByID(int id) {
		return repository.existsById(id);
	}


}
