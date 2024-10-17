package in.main.service;

import java.util.List;

import in.main.entity.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);
	List<Hotel> getAllHotel();
	Hotel getHotel(String id);
}
