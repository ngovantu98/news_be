package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "`Advertisement`")
public class Advertisement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private int id;

	@Column(name = "`name`", length = 200)
	private String name;

	@Column(name = "`content`", length = 200)
	private String content;

	@Column(name = "`date`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date date;

	public Advertisement(int id, String name, String content, Date date) {

		this.id = id;
		this.name = name;
		this.content = content;
		this.date = date;
	}

	public Advertisement() {
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

}