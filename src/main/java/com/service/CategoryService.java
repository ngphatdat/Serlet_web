package com.service;
import java.util.List;
import javax.inject.Inject;
import com.dao.ICaterogyDAO;
import com.model.CategoryModel;
import com.service.impl.ICategorySevice;

public class CategoryService implements ICategorySevice {
	
	@Inject
	private ICaterogyDAO CategoryDAO;
	
	@Override
	public List<CategoryModel> findAll() {
		return CategoryDAO.findAll();
	}
}
