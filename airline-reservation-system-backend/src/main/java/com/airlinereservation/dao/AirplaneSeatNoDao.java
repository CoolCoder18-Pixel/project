package com.airlinereservation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlinereservation.entity.Airplane;
import com.airlinereservation.entity.AirplaneSeatNo;
/**
 * @author Manoranjan Sahoo
 * @since2024 aug
 * {@summary:  Airline Reservation project}
 * @Mobile:8658664378
 */
@Repository
public interface AirplaneSeatNoDao extends JpaRepository<AirplaneSeatNo, Integer> {
	
	List<AirplaneSeatNo> findByAirplane(Airplane airplane);

}
