package com.vti.service;

import java.util.List;
import com.vti.entity.Image;
import com.vti.form.ImageFormCreate;

public interface IImageService {

	public List<Image> getAllImages();

	public Image getImageByID(int id);

	public void createImage(ImageFormCreate from);

	public void updateImage(Image image);

	public void deleteImage(int id);

	public boolean isImageExistsByID(int id);

	
}
