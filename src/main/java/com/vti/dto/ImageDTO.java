package com.vti.dto;

import java.io.Serializable;
import com.vti.entity.News;

@SuppressWarnings("serial")
public class ImageDTO implements Serializable {

	private String name;
	private int id;
	private String url;
	private News news;

	public ImageDTO(String name, int id, String url, News news) {
		this.name = name;
		this.id = id;
		this.url = url;
		this.news = news;
	}

	public ImageDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
