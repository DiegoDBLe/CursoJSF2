package curso.algaworks.cursojsf2.visao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import curso.algaworks.cursojsf2.dominio.Produto;

@ManagedBean
//@RequestScoped
//@ViewScoped
@SessionScoped
//@ApplicationScoped
public class GestaoProdutosBean {

	private List<Produto> produtos;
	private Produto produto;
	
	private Produto produtoSelecionado;
	
	public GestaoProdutosBean() {
		this.produtos = new ArrayList<Produto>();
		this.produto = new Produto();
	}
	@PostConstruct
	public void iniciar() {
		System.out.println("Iniciando Bean!");
	}
	
	public void verificarInclusao(ActionEvent event) {
		//if(this.produto.getFabricante().equals("")) {
		  if("".equals(this.produto.getFabricante())) {
			  this.produto.setFabricante("Sem Fabricante");
		}
		
	}
	
	public void incluir() {
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}
	
	public void excluir() {
		this.produtos.remove(this.produtoSelecionado);
	}
	
	public void finalizar() {
		System.out.println("Finalizando Bean!");
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public String retornarPagina() {
		if(this.produtos.isEmpty()) {
			return "PrimeiraPagina?face-redirect=true";
		}else {
			return "PrimeiraPaginaBackingBeans?face-redirect=true";
		}
	}
	
	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}
	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
}
