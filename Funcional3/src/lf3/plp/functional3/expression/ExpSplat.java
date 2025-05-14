package lf3.plp.functional3.expression;

import lf3.plp.expressions1.util.Tipo;
import lf3.plp.expressions2.expression.Expressao;
import lf3.plp.expressions2.expression.Valor;
import lf3.plp.expressions2.memory.AmbienteCompilacao;
import lf3.plp.expressions2.memory.AmbienteExecucao;
import lf3.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf3.plp.expressions2.memory.VariavelNaoDeclaradaException;
import lf3.plp.functional3.util.TipoLista;

/**
 * Representa uma expressão de splat: *exp
 * Utilizado para "desempacotar" listas em chamadas de função
 */
public class ExpSplat implements Expressao {

	private final Expressao lista;

	public ExpSplat(Expressao lista) {
		this.lista = lista;
	}

	public Expressao getLista() {
		return lista;
	}

	@Override
	public Valor avaliar(AmbienteExecucao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		Valor v = lista.avaliar(amb);
		if (!(v instanceof ValorLista)) {
			throw new RuntimeException("O operador * (splat) só pode ser usado com listas.");
		}
		return v; // A chamada de função deve cuidar de "desempacotar"
	}

	@Override
	public boolean checaTipo(AmbienteCompilacao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		Tipo t = lista.getTipo(amb);
		if (!(t instanceof TipoLista)) {
			throw new RuntimeException("O operador * só pode ser usado com listas.");
		}
		return true;
	}

	@Override
	public Tipo getTipo(AmbienteCompilacao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		Tipo t = lista.getTipo(amb);
		if (!(t instanceof TipoLista)) {
			throw new RuntimeException("O operador * só pode ser usado com listas.");
		}
		return ((TipoLista) t).getTipoElemento();
	}

	@Override
	public Expressao reduzir(AmbienteExecucao ambiente) {
		return new ExpSplat(lista.reduzir(ambiente));
	}

	@Override
	public Expressao clone() {
		return new ExpSplat(lista.clone());
	}

	@Override
	public String toString() {
		return "*" + lista.toString();
	}
}

