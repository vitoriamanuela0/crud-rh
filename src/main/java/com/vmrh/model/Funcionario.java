package com.vmrh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

	
	@Entity
	@Table(name = "tb_funcionarios")
	public class Funcionario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O nome não pode ficar sem ser preenchido.")
		@Size(min = 3, max = 100, message = "O atributo nome deve ter no mínimo 5 e no máximo 100 caracteres")
		private String nomeFuncionario;
		
		@NotNull
		private LocalDate dataNascimento;
		
		@NotBlank(message = "O setor não pode ficar sem ser preenchido.")
		@Size(min = 3, max = 100, message = "O nome deve ter no mínimo 5 e no máximo 100 caracteres")
		private String cargo;
		
		
		private BigDecimal salario;
		
		@ManyToOne
		@JsonIgnoreProperties("funcionario")
		private Setor setor;


		

		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNome() {
			return nomeFuncionario;
		}


		public void setNome(String nome) {
			this.nomeFuncionario = nome;
		}


		public LocalDate getDataNacimento() {
			return dataNascimento;
		}


		public void setDataNacimento(LocalDate dataNacimento) {
			this.dataNascimento = dataNacimento;
		}


		public BigDecimal getSalario() {
			return salario;
		}


		public void setSalario(BigDecimal salario) {
			this.salario = salario;
			
		
		}


		public String getCargo() {
			return cargo;
		}


		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		
		public Setor getSetor() {
			return setor;
		}


		public void setSetor(Setor setor) {
			this.setor = setor;
		}	


}
