package curso.algaworks.cursojsf2.estoque;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class ItemEstoque {

	private Integer codigoProduto;
	private String descricao;
	private Short quantidade;
	private BigDecimal valorUnitario;
	private Date dataChecagem;

}
