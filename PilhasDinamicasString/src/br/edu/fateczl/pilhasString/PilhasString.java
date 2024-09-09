package br.edu.fateczl.pilhasString;

public class PilhasString {

	No topo;
	
	public PilhasString() {
		topo = null;
	}
	
	
	public boolean Empy () { 
		if (topo == null){
			return true;
		}
		return false;
	}
	
	public void Push (String dado) {
		No elemento = new No();
		elemento.dado = dado;
		elemento.proximo = topo;
		topo = elemento;
				
	}
	
	public String Pop () {
		if (Empy()) {
			System.err.println("Não ha elementos para empilhar");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
		
	}
	
	public String top () {
		if (Empy()) {
			System.err.println("Pilha vazia");
		}
		String valor = topo.dado;
		return valor;
	}
	
	public int Size() {
		int cta = 0;
		if (!Empy()) {
			No aux = topo;
			cta = 1;
			while (aux.proximo != null) {
				cta ++;
				aux = aux.proximo;
			}
		}
		return cta;
	}
	
	

}
