package com.crud.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
//			con=DriverManager.getConnection("jdbc:mysql://walab.handong.edu:3306/camp4","camp4","bZrmMpQqBclWX9Mh");
			con=DriverManager.getConnection("jdbc:mysql://db4free:3306/hyeeun_db","hyeeun","Meme0110");
	    }catch(Exception e){
	    	System.out.println(e);
	    }  
	    if(con != null)
	    	System.out.println("db 연결 성공!");
	    return con;  
	}  

}