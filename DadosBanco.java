package Teste1;

public class DadosBanco {

	public static void main(String[] args) {
	Banco p1 = new Banco();
	p1.setDono("Renan");
	p1.setNumConta(101010);
	p1.abrirConta("CC");
	
	
	
	Banco p2 = new Banco();
	p2.setDono("Nataly");
	p2.setNumConta(44444);
    p2.abrirConta("CP");
    
    
    
    Banco p3 = new Banco ();
    p3.setDono("Lucas");
    p3.setNumConta(33333);
    p3.abrirConta("CP");
    
    p1.depositar(130);
    p2.depositar(100);
    p2.sacar(50);
    p1.sacar(200);
    p3.depositar(200);
    
    p1.fecharConta();
    p3.fecharConta();
    
    p1.estadoAtual();
    p2.estadoAtual();    
    p3.estadoAtual();
	}

}
