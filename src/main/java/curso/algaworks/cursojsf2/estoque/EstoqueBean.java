package curso.algaworks.cursojsf2.estoque;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@Getter
public class EstoqueBean {
	
	private ItemEstoque itemEstoque = new ItemEstoque();
	private List<ItemEstoque> itensEstoque = new ArrayList<ItemEstoque>();
	
	public void incluir() {
		this.itensEstoque.add(itemEstoque);
		this.itemEstoque = new ItemEstoque();
	}

}

