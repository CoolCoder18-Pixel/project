package com.airlinereservation.dto;

import java.math.BigDecimal;

import lombok.Data;
/**
 * @author Manoranjan Sahoo
 * @since2024 aug
 * {@summary:  Airline Reservation project}
 * @Mobile:8658664378
 */
@Data
public class AddWalletMoneyRequestDto {
	
	private int userId;
	
	private double  walletAmount;

}
