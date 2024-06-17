package com.kt.backend.dto;

import com.kt.backend.entity.Discount;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class ResItemDiscountDto {
	
	private Integer id;
	
	private int quantity;
	
	private Double price;
	
	private Discount discount;
}
