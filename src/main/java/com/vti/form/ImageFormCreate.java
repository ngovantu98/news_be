package com.vti.form;

import com.vti.entity.Image;
import com.vti.entity.News;

public class ImageFormCreate {

	private int id;
	private String name;
	private String url;
	private News news;

	public ImageFormCreate(int id, String name, String url, News news) {

		this.id = id;
		this.name = name;
		this.url = url;
		this.news = news;
	}

	public ImageFormCreate() {

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public Image toEntity() {
		return new Image(id, name, url, news);
	}
}
