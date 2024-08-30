package com.airlinereservation.dto;

import java.util.ArrayList;
import java.util.List;

import com.airlinereservation.entity.Airplane;

import lombok.Data;
/**
 * @author Manoranjan Sahoo
 * @since2024 aug
 * {@summary:  Airline Reservation project}
 * @Mobile:8658664378
 */
@Data
public class AirplaneResponseDto extends CommonApiResponse {
	
	private List<Airplane> airplanes = new ArrayList<>();

}
