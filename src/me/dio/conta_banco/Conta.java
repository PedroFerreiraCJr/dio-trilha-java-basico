package me.dio.conta_banco;

public class Conta {
	private Integer numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo;

	public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}
}
