package servlet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface BookDAO {
	
	Connection getConnection() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException;
	
	void registerBook(BookVO vo) throws SQLException;
	ArrayList<BookVO> showAllBook() throws SQLException;
	ArrayList<BookVO> findBook(String findKey, String findValue) throws SQLException;
	
}
