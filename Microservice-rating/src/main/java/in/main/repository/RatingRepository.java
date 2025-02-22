package in.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.main.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating,String>{

	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
