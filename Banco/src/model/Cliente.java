package model;

import java.util.Date;

import helper.Utils;

public class Cliente {
	private static int contador = 101;

	private int codigo;
	private String nome;
	private String email;
	private String cpf;
	private Date dataNascimento;
	private Date dataCadastro;
	
	public Cliente(String nome, String email, String cpf, Date dataNascimento) {
		this.codigo = Cliente.contador;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = new Date();
		
		Cliente.contador += 1;
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	
	@Override
	public String toString() {
		return "Código: " + this.getCodigo() +
			   "\nNome: " + this.getNome() +
			   "\nE-mail: " + this.getEmail() +
			   "\nCPF: " + this.cpf +
			   "\nData de Nascimento: " + Utils.dateParaString(this.getDataNascimento()) +
			   "\nData de Cadastro: " + Utils.dateParaString(this.dataCadastro);
	}
}
