package curso.algaworks.cursojsf2.financeiro.view;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
@Getter
public class ConsultaLancamentoBean {

	private List<String> lancamentos = new ArrayList<>();

	@PostConstruct
	public void inicializar() {
		for(int i = 0; i <20; i++) {
			lancamentos.add("");
		}
	}
}
