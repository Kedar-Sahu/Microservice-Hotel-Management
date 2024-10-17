package in.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.main.entity.Rating;
import in.main.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		Rating rating1=ratingService.create(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
	}
	
	@GetMapping("/getAllRating")
	public ResponseEntity<List<Rating>> getAllRating(){
		List<Rating> rating=ratingService.getAll();
		return ResponseEntity.ok(rating);
	}
	
	@GetMapping("/getAllRatingByUserId/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable String userId){
		List<Rating> rating=ratingService.getRatingByUserId(userId);
		return ResponseEntity.ok(rating);
	}
	
	@GetMapping("/getAllRatingByHotelId/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingByHotelId(@PathVariable String hotelId){
		List<Rating> rating=ratingService.getRatingByHotelId(hotelId);
		return ResponseEntity.ok(rating);
	}
}
