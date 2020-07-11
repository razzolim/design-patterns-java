package decorator;

/**
 * Sempre que percebemos que temos comportamentos que podem ser compostos por
 * comportamentos de outras classes envolvidas em uma mesma hierarquia, como foi
 * o caso dos impostos, que podem ser composto por outros impostos. O Decorator
 * introduz a flexibilidade na composição desses comportamentos, bastando
 * escolher no momento da instanciação, quais instancias serão utilizadas para
 * realizar o trabalho.
 * 
 * @author Renan
 *
 */
public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));

		Orcamento orcamento = new Orcamento(500.0);

		double valor = iss.calcula(orcamento);

		System.out.println(valor);
	}

}
