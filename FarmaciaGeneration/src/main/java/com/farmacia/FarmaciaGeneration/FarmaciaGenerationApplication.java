package com.farmacia.FarmaciaGeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaciaGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmaciaGenerationApplication.class, args);
	}

}

/* Na construção do relacionamento entre classes Categoria e Produto iremos utilizar a anotação @OneToMany e @ManyToOne
 * E a anotação @JsonIgnoreProperties para que não haja uma recursividade desnecessária para obter os recursos.
 */