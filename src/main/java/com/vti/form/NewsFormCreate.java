package com.vti.form;

import java.sql.Date;
import java.util.List;
import com.vti.entity.Image;
import com.vti.entity.News;
import com.vti.entity.NewsSummary;

public class NewsFormCreate {

	private int id;
	private String name;
	private String content;
	private Date date;
	private String header;
	private String conclude;
	private NewsSummary newsSummary;
	private List<Image> image;

	

	public NewsFormCreate(int id, String name, String content, Date date, String header, String conclude,
			NewsSummary newsSummary, List<Image> image) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.date = date;
		this.header = header;
		this.conclude = conclude;
		this.newsSummary = newsSummary;
		this.image = image;
	}

	public NewsFormCreate() {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getConclude() {
		return conclude;
	}

	public void setConclude(String conclude) {
		this.conclude = conclude;
	}

	public NewsSummary getNewsSummary() {
		return newsSummary;
	}

	public void setNewsSummary(NewsSummary newsSummary) {
		this.newsSummary = newsSummary;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public News toEntity() {
		return new News(id, name, content, date, header, conclude,newsSummary, image);
	}

}
