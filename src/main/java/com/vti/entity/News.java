package com.vti.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "`News`")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private int id;

	@Column(name = "`name`", length = 200)
	private String name;

	@Column(name = "`content`", length = 5000)
	private String content;

	@Column(name = "`date`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date date;

	@Column(name = "`header`", length = 500)
	private String header;

	@Column(name = "`conclude`", length = 200)
	private String conclude;

	@JsonIgnore
	@OneToOne(mappedBy = "news",fetch = FetchType.LAZY)
	private NewsSummary newsSummary;

	@OneToMany(mappedBy = "news")
	@Fetch(FetchMode.SUBSELECT)
	private List<Image> image;

	public News(int id, String name, String content, Date date, String header, String conclude, NewsSummary newsSummary,
			List<Image> image) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.date = date;
		this.header = header;
		this.conclude = conclude;
		this.newsSummary = newsSummary;
		this.image = image;
	}

	public News() {

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

}