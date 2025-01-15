package com.vti.form;

import java.util.List;

import com.vti.entity.Category;
import com.vti.entity.NewsSummary;

public class CategoryFormCreate {

	private int id;
	private String name;
	private List<NewsSummary> newsSummary;
	
	

	
	public CategoryFormCreate(int id, String name, List<NewsSummary> newsSummary) {

		this.id = id;
		this.name = name;
		this.newsSummary = newsSummary;
	}


	public CategoryFormCreate() {
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


	public Category toEntity() {
		return new Category(id,name,newsSummary);
	}

}
