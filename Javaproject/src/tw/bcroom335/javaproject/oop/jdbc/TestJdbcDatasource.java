package tw.bcroom335.javaproject.oop.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class TestJdbcDatasource implements DataSource {

	private Properties props;
	private List<Connection> connPools;
	private String mySQLurl,myUser,mypwd;
	private int maxConn;
	private Connection conn;

	public TestJdbcDatasource() throws IOException {
		this("mysqlserverjdbc.properties");
	}

	public TestJdbcDatasource(String config) throws IOException {
		props=new Properties();
		props.load(new FileInputStream(config));
		
		mySQLurl=props.getProperty("mySQLUrl");
		myUser=props.getProperty("myUser");
		mypwd = props.getProperty("mypwd");
		maxConn=Integer.parseInt(props.getProperty("maxConn"));
		
		connPools=Collections.synchronizedList(new ArrayList<Connection>());
		
	}

	@Override
	public Connection getConnection() throws SQLException {
		if(connPools.isEmpty()) {
			conn=DriverManager.getConnection(mySQLurl, myUser, mypwd);
			return conn;
		}else {
			return connPools.remove(connPools.size()-1);
		}
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		if(connPools.isEmpty()) {
			conn =DriverManager.getConnection(mySQLurl, myUser, mypwd);
			return conn;
		}else {
			return connPools.remove(connPools.size()-1);
		}
	}
	
	public void connclose() throws SQLException {
		if(connPools.size()==maxConn) {
			conn.close();
		}else {
			connPools.add(conn);
		}
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
