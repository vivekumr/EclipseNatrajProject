package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
@Component("menup")
public class MenuPrice {
	@Value("${menu.dosarate}")
	private Float  dosaPrice;
	@Value("${menu.idlyrate}")
	private Float   idlyPrice;
	@Value("${menu.poharate}")
	private  Float  pohaPrice;
	@Value("${menu.vprate}")
	private  Float  vadaPavPrice;
}
