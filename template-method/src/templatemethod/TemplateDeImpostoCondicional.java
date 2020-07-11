package templatemethod;

/**
 * Quando temos diferentes algoritmos que possuem estruturas parecidas, o
 * Template Method é uma boa solução. Com ele, conseguimos definir, em um nível
 * mais macro, a estrutura do algoritmo e deixar "buracos", que serão
 * implementados de maneira diferente por cada uma das implementações
 * específicas.
 * <br><br>
 * Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos
 * possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto dos
 * detalhes do algoritmo, já que cada classe tem sua responsabilidade bem
 * separada.
 * 
 * @author Renan
 *
 */
public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
