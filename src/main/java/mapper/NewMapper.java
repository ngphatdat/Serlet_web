package mapper;

import java.sql.ResultSet;

import com.model.NewsModel;

public class NewMapper implements IRowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet rs) {
		try {
			NewsModel newsModel = new NewsModel();
			newsModel.setId(rs.getLong("id"));
			}
			
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
}
}