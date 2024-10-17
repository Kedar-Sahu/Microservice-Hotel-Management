package in.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Rating {

	@Id
	private String ratingId;
	private String userId;
	private String hotelId;
	private Double rating;
	private String feedback;
}
