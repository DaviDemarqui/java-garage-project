package com.demarqui.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
	//Campo Marca e modelo devem ser obrigatorios para o cadastro do veiculo...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Conteudo do campo é obrigatorio")
	@Column(nullable = false, length = 15)
	private String marca;
	
	//@Size( max = 15, min = 2, message="maximo permitido") 1 - Anotação Size
	
	@NotBlank(message = "Conteudo do campo é obrigatorio")
	@Column(nullable = false, length = 15)
	private String modelo;
	
	@Column(length = 7)
	@Size(max = 7, min = 7, message = "A placa deve conter 7 caractéres")
	private int placa;
	
}
