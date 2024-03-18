package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.dao.IGenericDAO;

import mapper.IRowMapper;

public class AbstractDAO<T> implements IGenericDAO<T> {
	
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

	@Override
	public <T> java.util.List<T> Query(String sql, IRowMapper<T> rowMapper, Object... parameters) {
		// TODO Auto-generated method stub
		return null;
	}


}