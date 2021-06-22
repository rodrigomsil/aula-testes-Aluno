package ex07.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import ex07.Aluno;

public class Aluno_test {
	
	private Aluno a1;
	
	@BeforeEach
	private void instanciarObjetos() {
		a1 = new Aluno();
	}

	// teste nome vazio, retorna erro de execução
	@Test
	public void avaliaNomeVazio() {
	 
	String entrada = "";
	assertThrows(RuntimeException.class,()->a1.setNome(entrada), "Nome Vazio");
	}
	
	//exede tamanho
	@Test
	public void avaliaNomeExedeTamanho() {
	 
	String entrada = "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooppppd";
	assertThrows(RuntimeException.class,()->a1.setNome(entrada));
	}
	
	@Test
	public void deveRetornarNota0() {
		assertEquals(0, a1.retornaNotaTotal(), 0.0001);
	}
	
	// soma nota nao pode passar 100
	@Test
	public void naoutrapassarLImeteNotaUmLAncamento() {		
		assertThrows(Exception.class, () -> {
			a1.entraNota(120);			
		});	}
	
	// exede limite de lancamentos.
	@Test
	public void naoutrapassarLimetenotaVariosLAncamento()  throws Exception{
		a1.entraNota(20);
		a1.entraNota(20);
		a1.entraNota(30);
		a1.entraNota(20);
		a1.entraNota(20);
		assertEquals(100, a1.retornaNotaTotal(), 0.0001);	}
	
	@Test
	public void aceitarLimiteNota() throws Exception {
		a1.entraNota(20);
		a1.entraNota(20);
		a1.entraNota(30);
		a1.entraNota(30);
		assertEquals(100, a1.retornaNotaTotal(), 0.0001);	
		}
	
}




