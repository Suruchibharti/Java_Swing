package calc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class jdbcexp {
public static void main(String[]args){
	try{
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/ebookstore","root","root"
		);
		Statement stmt = conn.createStatement();
		
		String query = "select * from books";
		String query2 = "insert into books values(103,'C++',22.22,25);";
		stmt.executeUpdate(query2);
		ResultSet rset = stmt.executeQuery(query);
		int rowCount=0;
		
		while(rset.next()){
			int id = rset.getInt("id");
			String title = rset.getString("title");
			double price = rset.getDouble("price");
			int qty=rset.getInt("qty");
			System.out.println(id+"title"+"price"+"qty");
			++rowCount;
			
		}
		System.out.println("No. of rows retrieved"+rowCount);	
	}
	catch(SQLExecution ex){
		
	}
}
}


