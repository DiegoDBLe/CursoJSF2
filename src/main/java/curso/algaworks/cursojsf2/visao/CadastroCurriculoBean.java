package curso.algaworks.cursojsf2.visao;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroCurriculoBean {
	
	private String vaga = "A0382D";
	private String cargo = "Programador Java Jr.";
	public String getVaga() {
		return vaga;
	}
	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
