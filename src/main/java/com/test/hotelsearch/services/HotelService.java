package com.test.hotelsearch.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.hotelsearch.DAO.HotelDAO;
import com.test.hotelsearch.models.Hotel;

@Service
public class HotelService {

	@Autowired
	private HotelDAO hotelDAO;
	
	public List<Hotel> getHotels(){
		List<Hotel> hotelList = new ArrayList<Hotel>();
		hotelList = hotelDAO.getHotels();
		return hotelList;
	}
	
	public List<Hotel> getHotelByName(String hotelName){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        hotelList = hotelDAO.getHotelByName(hotelName);
		return hotelList;
	}
	
	public boolean updateHotel(Hotel hotel) {
		boolean isUpdated = false;
		isUpdated = hotelDAO.updateHotel(hotel);
		
		return isUpdated;
	}
	
	
	
	public boolean deleteHotel(String hotelId) {
		
		boolean isDeleted = false;
		isDeleted = hotelDAO.deleteHotel(hotelId);
		return isDeleted;
		
	}
	
	public boolean addHotel(Hotel hotel) {
		
		boolean isAdded = false;
		isAdded = hotelDAO.addHotel(hotel);
		return isAdded;
	}
}
