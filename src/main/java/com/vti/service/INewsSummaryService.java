package com.vti.service;

import java.util.List;
import com.vti.entity.NewsSummary;
import com.vti.form.NewsSummaryFormCreate;

public interface INewsSummaryService {

	public List<NewsSummary> getAllNewsSummarys();

	public NewsSummary getNewsSummaryByID(int id);

	public void createNewsSummary(NewsSummaryFormCreate from);

	public void updateNewsSummary(NewsSummary newsSummary);

	public void deleteNewsSummary(int id);

	public boolean isNewsSummaryExistsByID(int id);
	
	public List<NewsSummary> getNewsSummaryByType(String type);

	
}
