package com.crud.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://walab.handong.edu:3306/camp4","camp4","bZrmMpQqBclWX9Mh");
	    }catch(Exception e){
	    	System.out.println(e);
	    }  
	    if(con != null)
	    	System.out.println("db 연결 성공!");
	    return con;  
	}  

}