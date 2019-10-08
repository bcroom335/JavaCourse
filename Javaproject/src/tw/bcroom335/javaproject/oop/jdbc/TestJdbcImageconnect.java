package tw.bcroom335.javaproject.oop.jdbc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJdbcImageconnect {
	
	private TestJdbcDatasource jdbc3;
	private Connection conn;

	public TestJdbcImageconnect() throws IOException, SQLException{
		jdbc3=new TestJdbcDatasource();
		conn=jdbc3.getConnection();
		boolean status = !conn.isClosed();
		System.out.println("Status:"+status);
	}
	
	public void processInsertImage() throws FileNotFoundException, SQLException {
		FileInputStream fis1 = new FileInputStream(new File("c:temp/spiderman.jpg"));
		String sqlstr="Insert Into gallery(imageName,imageFile) values(?,?)";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setString(1, "spiderman");
		state.setBinaryStream(2, fis1);
		state.execute();
		state.close();
		System.out.println("Image saved.");
	}
	
	public void processRetrieveImage1() throws SQLException, IOException {
		String sqlstr="select * from gallery where gallery_Id=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setInt(1, 1);
		ResultSet rs = state.executeQuery();
		while(rs.next()) {
			Blob blob = rs.getBlob(3);
			System.out.println("Length:"+blob.length());
			
			BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("c:/temp/newspider.jpg"));
								//從第幾個字元取到資料的最後長度
			bos1.write(blob.getBytes(1, (int)blob.length()));
			bos1.flush();
			bos1.close();
		}
		rs.close();
		state.close();
		System.out.println("Image Retrieved1 successed");
	}
	
	public void processRetrieveImage2() throws SQLException, IOException {
		String sqlstr="select * from gallery where gallery_Id=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setInt(1, 1);
		ResultSet rs = state.executeQuery();
		while(rs.next()) {
											//指定資料欄位
			InputStream is1 = rs.getBinaryStream(3);
			
			BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("c:/temp/anotherspider.jpg"));
			int data;
			while((data=is1.read())!=-1) {
				bos1.write(data);
			}
			bos1.flush();
			bos1.close();
			is1.close();
		}
		rs.close();
		state.close();
		System.out.println("Image Retrieved2 successed");
	}
	
	public void closeDb() throws SQLException {
		jdbc3.connclose();
	}

	public static void main(String[] args) {
		try {
			TestJdbcImageconnect imageAction=new TestJdbcImageconnect();
			
			//imageAction.processInsertImage();
			//imageAction.processRetrieveImage1();
			imageAction.processRetrieveImage2();
			
			imageAction.closeDb();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
