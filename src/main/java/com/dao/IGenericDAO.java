package com.dao;

import java.util.List;
import mapper.IRowMapper;

public interface IGenericDAO<T> {
<T>List<T> Query(String sql,IRowMapper<T> rowMapper ,Object...parameters);
}
 