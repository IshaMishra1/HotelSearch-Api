package com.test.hotelsearch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.hotelsearch.models.Hotel;
import com.test.hotelsearch.services.HotelService;

@RestController
@RequestMapping("api/v1/hotelsearch")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	@RequestMapping(value = "/hotels",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Hotel> getHotels(){
		List<Hotel> hotelList = hotelService.getHotels();
	
	return hotelList;
	}
	
	@RequestMapping(value = "/hotels/{name}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Hotel> getHotelsByName(@PathVariable("name") String hotelName){
		List<Hotel> hotelList = new ArrayList<Hotel>();
		hotelList = hotelService.getHotelByName(hotelName);
		return hotelList;
	}
	
	@RequestMapping(value = "/edithotels",method = RequestMethod.PATCH,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateHotel(@RequestBody Hotel hotel) {
		boolean isUpdated = false;
		isUpdated = hotelService.updateHotel(hotel);
		
		return isUpdated;
		
	}
	@RequestMapping(value = "/removehotel/{hotelid}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteHotel(@PathVariable("hotelid") String hotelId) {
	 
		boolean isDeleted = false;
		isDeleted = hotelService.deleteHotel(hotelId);
		return isDeleted;
		
	}

	@RequestMapping(value = "/addhotel",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean addHotel(@RequestBody Hotel hotel) {

		boolean isAdded = false;
		isAdded = hotelService.addHotel(hotel);
		return isAdded;
	}
}
