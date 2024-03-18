package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ICaterogyDAO;
import com.model.CategoryModel;

public class CategoryDAO implements ICaterogyDAO {

	@Override
	public List<CategoryModel> findAll() {
		List<CategoryModel> results = new ArrayList<>();
		String sql = "SELECT * FORM category";
		Connection connection = getconnection();
		PreparedStatement statement = null;
		ResultSet resultset = null;

		if (connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultset = statement.executeQuery();
				while (resultset.next()) {
					CategoryModel category = new CategoryModel();
					category.setId(resultset.getLong("id"));
					category.setCode(resultset.getString("code"));
					category.setName(resultset.getString("name"));
					results.add(category);
				}
				return results;
			} catch (SQLException e) {
				return null;
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultset != null) {
						resultset.close();
					}
				} catch (Exception e2) {
					return null;
				}

			}

		}
		return null;
	}

	public Connection getconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/newserlet";
			String user = "root";
			String password = "admin";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

}
