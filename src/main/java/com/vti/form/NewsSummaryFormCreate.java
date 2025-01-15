package com.vti.form;

import com.vti.entity.Category;
import com.vti.entity.News;
import com.vti.entity.NewsSummary;

public class NewsSummaryFormCreate {

	private int id;
	private String name;
	private String image;
	private String type;
	private Category category;
	private News news;

	public NewsSummaryFormCreate(int id, String name, String image, String type, Category category, News news) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.type = type;
		this.category = category;
		this.news = news;
	}

	public NewsSummaryFormCreate() {
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public NewsSummary toEntity() {
		return new NewsSummary(id, name, image, type, category, news);
	}

}
