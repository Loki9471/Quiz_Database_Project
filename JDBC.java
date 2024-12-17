package com.QuizDatabase;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {
	public static Connection jdbcconnection() {
	Connection co=null;
	   try {
		   
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   FileInputStream fs=new FileInputStream("\\V:\\java\\db.properties\\");
		   Properties ps=new Properties();
		   ps.load(fs);
		   String url=ps.getProperty("url");
		   String username=ps.getProperty("username");
		   String password=ps.getProperty("password");
		   co=DriverManager.getConnection(url,username,password);
	   }catch(ClassNotFoundException e) {
		   System.out.println("jdbc not found");
		   e.printStackTrace();
	   }catch(Exception e) {
		   System.out.println("error in establishing");
		   e.printStackTrace();
	   }
	return co;

	}

}
