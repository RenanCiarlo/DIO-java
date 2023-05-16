package Teste1;

public class Banco {
public int numConta;
protected String Tipo;
private String Dono;
private float Saldo;
private boolean Status;
//Métodos Personalizados
public void estadoAtual() {
	System.out.println("------------------------------");
	System.out.println("Conta: " + this.getNumConta());
	System.out.println("Tipo: " + this.getTipo());
	System.out.println("Dono: " + this.getDono());
	System.out.println("Saldo: " + this.getSaldo());
	System.out.println("Status da conta " + this.getStatus());
}
public void abrirConta(String t) {
	this.setTipo(t);
	this.setStatus(true);
	if (t== "CC") {
		this.setSaldo(50);
	} else if (t == "CP") {
         this.setSaldo(150);
	}
	System.out.println("Conta aberta com sucesso");
}
public void fecharConta() {
	if (this.getSaldo() > 0 ) {
		System.out.println("Conta não pode ser fechada porque ainda tem  dinheiro");
	} else if(this.getSaldo() < 0) {
		System.out.println("Conta não pode ser fechada pois tem Débito");
	} else {
		this.setStatus(false);
		System.out.println("Conta fechada com sucesso");
	}

}
public void depositar(float v) { //depositar recebe um valor
	if (this.getStatus()) {
		this.setSaldo(this.getSaldo()+v);
		System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
	} else {
		System.out.println("Impossivel depositar em uma conta fechada!");
	}
	
}
public void sacar (float v) { 
	if ( this.getStatus()) {  // para vê se a conta esta aberta
		if (this.getSaldo()>=v) { // se o saldo for maior/igual que o "v" 
			this.setSaldo(this.getSaldo()-v); // O Set Saldo vai mudar o valor que estava no Get Saldo pois houve um saque no getSaldo
			System.out.println("Saque realizado na conta de " + this.getDono());
		} else { // se não
			System.out.println("Saldo insuficiente para saque");
		}
	} else { // else do primeiro IF
		System.out.println("Impossível sacar de uma conta fechada! ");
	}
}
public void pagarMensal() {
	int v = 0;
	if (this.getTipo() == "CC") {
		v = 12;
	} else if (this.getTipo() == "CP"){
        v = 20;
	} if(this.getStatus()){
		this.setSaldo(this.getSaldo() - v );
		System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		
	} else {
		System.out.println("Impossivel pagar uma conta fechada!");
	}
	
}
//Métodos Especiais
public Banco() {
	this.setSaldo(0);
	this.setStatus(false);
}
public int getNumConta() {
	return numConta;
}
public void setNumConta(int numConta) {
	this.numConta = numConta;
}
public String getTipo() {
	return Tipo;
}
public void setTipo(String tipo) {
	Tipo = tipo;
}
public String getDono() {
	return Dono;
}
public void setDono(String dono) {
	Dono = dono;
}
public float getSaldo() {
	return Saldo;
}
public void setSaldo(float saldo) {
	Saldo = saldo;
}
public boolean getStatus() {
	return Status;
}
public void setStatus(boolean status) {
	Status = status;
}
 
}
