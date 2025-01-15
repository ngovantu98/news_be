package com.vti.dto;

import java.io.Serializable;
import java.util.List;
import com.vti.entity.NewsSummary;

@SuppressWarnings("serial")
public class CategoryDTO implements Serializable {

	private String name;
	private int id;
	private List<NewsSummary> newsSummarys;

	public CategoryDTO(String name, int id, List<NewsSummary> newsSummarys) {
		this.name = name;
		this.id = id;
		this.newsSummarys = newsSummarys;
	}

	public CategoryDTO() {

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

	public List<NewsSummary> getNewsSummarys() {
		return newsSummarys;
	}

	public void setNewsSummarys(List<NewsSummary> newsSummarys) {
		this.newsSummarys = newsSummarys;
	}

}
