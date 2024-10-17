package in.main.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {

	private String ratingId;
	private String userId;
	private String hotelId;
	private Double rating;
	private String remark;
	private String feedback;
}
