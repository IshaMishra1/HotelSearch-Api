package com.test.hotelsearch.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.test.hotelsearch.models.Hotel;

@Component
public class HotelDAO {

	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String driver = "org.sqlite.JDBC";
	private String url = "jdbc:sqlite:hotelsearch:hotelsearch.db";
	
	
	public List<Hotel> getHotels(){
		List<Hotel> hotelList = new ArrayList<Hotel>();
		String sql = "select * from hotel";
		try {
			Class.forName(driver);
			Class.forName(driver);
	    	  connection = DriverManager.getConnection(url);
	    	  ps= connection.prepareStatement(sql);
	    	  rs = ps.executeQuery();
	    	  while(rs.next()) {
	    		  Hotel hotel = new Hotel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
	    	  hotelList.add(hotel);
	    	  }
	    	  
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return hotelList;
		
	}
	
	public List<Hotel> getHotelByName(String hotelName){
		
        List<Hotel> hotelList = new ArrayList<Hotel>();
        String sql = "select * from hotel where hotelname=?";
      try {
    	  Class.forName(driver);
    	  connection = DriverManager.getConnection(url);
    	  ps= connection.prepareStatement(sql);
    	  rs = ps.executeQuery();
    	  while(rs.next()) {
    		  Hotel hotel = new Hotel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
    	  hotelList.add(hotel);
    	  }
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return hotelList;
	}
	
	public boolean addHotel(Hotel hotel){
		boolean isAdded = false;
		String sql = "insert into hotel values(?,?,?,?,?,?,?,?,?,?,?)";
		
	      try {
	    	  Class.forName(driver);
	    	  connection = DriverManager.getConnection(url);
	    	  ps= connection.prepareStatement(sql);
	    	  ps.setString(1, hotel.getHotelId());
	    	  ps.setString(2,hotel.getHotelName());
	    	  ps.setString(3, hotel.getHotelType());
	    	  ps.setInt(4, hotel.getHotelRating());
	    	  ps.setString(5, hotel.getAddress());
	    	  ps.setString(6,hotel.getCity());
	    	  ps.setString(7, hotel.getPostalCode());
	    	  ps.setString(8, hotel.getCountry());
	    	  ps.setString(9,hotel.getContactNumber());
	    	  ps.setString(10, hotel.getOpenTime());
	    	  ps.setString(11, hotel.getCloseTime());
	    	  int i = ps.executeUpdate();
	    	  if(i>0)
	    	  {
	    		  isAdded = true;
	    	  }
	    	   
			}catch(Exception e)
			{
				System.out.println(e);
			
			}
			
		
		return isAdded;
		
		
	}
	
    public boolean updateHotel(Hotel hotel){
		
    	boolean isUpdated = false;
    	String sql = "update table hotel where hotelId = ?";
        try {
        	Class.forName(driver);
	    	  connection = DriverManager.getConnection(url);
	    	  ps= connection.prepareStatement(sql);
	    	  int i = ps.executeUpdate();
	    	  if(i>0) {
	    		  isUpdated = true;
	    	  }
	    	  
        
			
  		}catch(Exception e)
		{
			System.out.println(e);
		
		}
  		
    	
    	return isUpdated;
	}

   public boolean deleteHotel(String hotelId){
	
	   boolean isDeleted = false;
	   String sql = "delete from hotel where hotelId = ?";
	      try {
	    	  Class.forName(driver);
	    	  connection = DriverManager.getConnection(url);
	    	  ps= connection.prepareStatement(sql);
	    	  int i = ps.executeUpdate();
	          if(i>0) {
	        	  isDeleted = true;
	          }
				
			}catch(Exception e)
			{
				System.out.println(e);
			
			}
			
	   
	   return isDeleted;
   }
   
}
