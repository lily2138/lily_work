package broker.three.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.transaction.InvalidTransactionException;

import broker.three.exception.DuplicateSSNException;
import broker.three.exception.RecordNotFoundException;
import broker.three.vo.CustomerRec;
import broker.three.vo.SharesRec;
import broker.three.vo.StockRec;



public interface DatabaseTemplate {
	Connection getConnect() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException;
	
	//비지니스 로직....
	void addCustomer(CustomerRec cust) throws SQLException, DuplicateSSNException;
	void deleteCustomer(String ssn) throws SQLException, RecordNotFoundException;
	void updateCustomer(CustomerRec cust) throws SQLException, RecordNotFoundException;
	
	Vector<SharesRec> getPortfolio(String ssn) throws SQLException;
	CustomerRec getCustomer(String snn) throws SQLException, RecordNotFoundException;
	ArrayList<CustomerRec> getAllCustomers() throws SQLException;
	ArrayList<StockRec> getAllStocks() throws SQLException;

	
	//비지니스 로직.... 특화된 로직....
	void buyShares(String ssn, String symbol, int quantity) throws SQLException, RecordNotFoundException;
	void sellShares(String ssn, String symbol, int quantity) throws SQLException, RecordNotFoundException, InvalidTransactionException;
	
	
	
	
	
	
	
	
}
