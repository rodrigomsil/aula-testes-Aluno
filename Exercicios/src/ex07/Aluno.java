package ex07;

import java.util.ArrayList;
import java.util.List;

/**
 * Desenvolvimento da classe Aluno em engenharia de software 2 onde a mesma retora varios dados
 * 
 * @author Rodrigo
 *
 */
public class Aluno {

		
	private String nome;
	private List<Double> notas = new ArrayList<Double>();
	
	public Aluno() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length()==0 ||nome.length()>100 ) {
			throw new RuntimeException("Nome Invalido!");
		}
		this.nome = nome;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	public void entraNota(double nota) throws Exception {
		if (nota >= 0 && nota <= 30) {
			notas.add(nota);
		} else {
			throw new Exception("A Nota deve ser entre 0 e 30");
		}
	}
	
	public double retornaNotaTotal() {
		double retorno = 0;
		for (double nota : notas) {
			retorno = retorno + nota;
		}
		if (retorno > 100) {
			return 100;
		} else {
			return retorno;
		}
	}
}
