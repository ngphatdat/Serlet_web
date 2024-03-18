package com.dao;

import java.util.List;

import com.model.CategoryModel;

public interface INewDAO {
	List<CategoryModel> findByCategory();
}