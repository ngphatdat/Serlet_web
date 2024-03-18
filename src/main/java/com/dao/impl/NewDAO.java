package com.dao.impl;
import java.util.List;

import javax.inject.Inject;

import com.dao.INewDAO;
import com.model.CategoryModel;;
public class NewDAO implements INewDAO {
	@Inject
	private CategoryModel CategoryDAO;
	@Override
	public List<CategoryModel> findByCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
