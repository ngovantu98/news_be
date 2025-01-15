package com.vti.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "`Category`")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private int id;

	@Column(name = "`name`", length = 200)
	private String name;

	@OneToMany(mappedBy = "category")
	@Fetch(FetchMode.SUBSELECT)
	private List<NewsSummary> newsSummary;

	public Category(int id, String name, List<NewsSummary> newsSummary) {
		this.id = id;
		this.name = name;
		this.newsSummary = newsSummary;
	}

	public Category() {

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

	public List<NewsSummary> getNewsSummary() {
		return newsSummary;
	}

	public void setNewsSummary(List<NewsSummary> newsSummary) {
		this.newsSummary = newsSummary;
	}

}