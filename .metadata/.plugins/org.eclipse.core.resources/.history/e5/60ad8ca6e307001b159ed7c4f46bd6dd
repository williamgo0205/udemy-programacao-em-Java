package br.com.geekuniversity.secao11;

/*
Getters e Setters 

Getter
 - é um método publico que serve para consultar os dados
 - A monenclatura desse método é getNome_do_atributo()
*/
public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
//	public void setSaldo(float saldo) {
//		this.saldo = saldo;
//	}
	
	// método getter do atributo saldo
	public float getSaldo() {
		return this.saldo + this.limite;
	}

	public void sacar(float valor) {
		if (valor <=  this.saldo) {
			this.saldo = this.saldo - valor;
			
		}else if(valor <= (this.saldo + this.limite)) {
			float val_ret;			
			val_ret = (this.saldo + this.limite) - valor;
			
			this.saldo = 0;
			
			if (val_ret == 0) {
				this.limite = 0;
			}else {
				this.limite = val_ret;
			}
            
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

}
