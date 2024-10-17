package in.main.service;

import java.util.List;

import in.main.entity.Rating;

public interface RatingService {

	Rating create(Rating rating);
	List<Rating> getAll();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);
}
