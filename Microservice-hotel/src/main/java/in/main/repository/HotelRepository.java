package in.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.main.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String>{

}
