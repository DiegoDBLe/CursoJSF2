package curso.algaworks.cursojsf2.visao;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormularioBean {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String enviar() {
		return "Resultado";
	}
}
