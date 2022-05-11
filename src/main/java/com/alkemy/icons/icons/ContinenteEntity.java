package com.alkemy.icons.icons;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "continente")
@Getter
@Setter
public class ContinenteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
}
