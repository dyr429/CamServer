package com.conn;
import java.sql.*;
public class CameraDAO {
	static Connection conn;
	static PreparedStatement pst;
	
	public static int insertCamera(CameraBean u){
		int status=0;
		try{
			conn = ConnectionProvider.getCon();
			pst = conn.prepareStatement("insert into camera values(?,?);");
			
			
			pst.setInt(1, u.getCameraID());
			pst.setInt(2, u.getType());
			/*
			pst.setInt(3, u.getHeight());
			pst.setInt(4, u.getOrientation());
			pst.setBoolean(5, true);
			pst.setInt(6, u.getComfirmtimes());
			pst.setInt(7, u.getConfidence());
			pst.setString(8, null);*/
			status=pst.executeUpdate();
			conn.close();
			
					
		}catch(Exception ex){
			System.out.println(ex);
			
		}
		return status;
	}

}
