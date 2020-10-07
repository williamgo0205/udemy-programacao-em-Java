package br.com.geekuniversity.secao11;

/*
Getters e Setters 

Getter
 - � um m�todo publico que serve para consultar os dados
 - A monenclatura desse m�todo � getNome_do_atributo()
*/
@SuppressWarnings("unused")
public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;

	public Conta() {
	}

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	/**
	 * M�todo getter do atributo saldo
	 * 
	 * @return a soma do saldo mais o limite
	 */
	public float getSaldo() {
		return this.saldo + this.limite;
	}

	/**
	 * M�todo para realizar o saque
	 * 
	 * @param valor
	 *            a ser sacado
	 */
	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso.");

		} else if (valor <= (this.saldo + this.limite)) {
			float val_ret;
			val_ret = (this.saldo + this.limite) - valor;

			this.saldo = 0;

			if (val_ret == 0) {
				this.limite = 0;
			} else {
				this.limite = val_ret;
			}

			System.out.println("Saque realizado com sucesso.");

		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	/**
	 * M�todo para realizar dep�sito
	 *
	 * @param valor
	 *            a ser depositado
	 */
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	/**
	 * M�todo toString sobrescrito
	 */
	@Override
	public String toString() {
		return "O Saldo da conta �: " + this.getSaldo();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		} else {
			Conta verificar = (Conta) obj; // Cast
			return verificar.getSaldo() == this.getSaldo();
		}
	}

}
