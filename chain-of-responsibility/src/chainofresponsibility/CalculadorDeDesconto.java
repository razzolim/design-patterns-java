package chainofresponsibility;

/**
 * O padrão Chain of Responsibility cai como uma luva quando temos uma lista de
 * comandos a serem executados de acordo com algum cenário em específico, e
 * sabemos também qual o próximo cenário que deve ser validado, caso o anterior
 * não satisfaça a condição.
 * <br><br>
 * Nesses casos, o Chain of Responsibility nos possibilita a separação de
 * responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira
 * flexível e desacoplada de juntar esses comportamentos novamente.
 * 
 * @author Renan
 *
 */
public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		return d1.desconta(orcamento);
	}

}
