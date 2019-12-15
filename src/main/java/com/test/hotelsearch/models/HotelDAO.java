package com.test.hotelsearch.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
public class Hotel {
	public Hotel() {
		
	}
	public Hotel(String hotelId, String hotelName, String hotelType, int hotelRating, String address, String city,
			String postalCode, String country, String contactNumber, String openTime, String closeTime) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		this.hotelRating = hotelRating;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
		this.contactNumber = contactNumber;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String hotelId;
	private String hotelName;
	private String hotelType;
	private int hotelRating;
	private String address;
	private String city;
	private String postalCode;
	private String country;
	private String contactNumber;
	private String openTime;
	private String closeTime;
	
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelType=" + hotelType + ", hotelRating="
				+ hotelRating + ", address=" + address + ", city=" + city + ", postalCode=" + postalCode + ", country="
				+ country + ", contactNumber=" + contactNumber + ", openTime=" + openTime + ", closeTime=" + closeTime
				+ "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getHotelRating() {
		return hotelRating;
	}
	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	

}
