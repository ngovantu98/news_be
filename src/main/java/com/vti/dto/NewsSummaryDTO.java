package com.vti.dto;

import java.io.Serializable;
import com.vti.entity.News;

@SuppressWarnings("serial")
public class NewsSummaryDTO implements Serializable {

	private int id;
	private String name;
	private String image;
	private String type;
	private News news;

	public NewsSummaryDTO(int id, String name, String image, String type, News news) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.type = type;
		
		this.news = news;
	}

	public NewsSummaryDTO() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

}
