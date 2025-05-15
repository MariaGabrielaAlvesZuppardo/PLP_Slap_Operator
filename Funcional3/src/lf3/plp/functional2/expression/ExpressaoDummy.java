package lf3.plp.functional2.expression;

import lf3.plp.expressions1.util.Tipo;
import lf3.plp.expressions2.expression.Expressao;
import lf3.plp.expressions2.expression.Valor;
import lf3.plp.expressions2.memory.AmbienteCompilacao;
import lf3.plp.expressions2.memory.AmbienteExecucao;
import lf3.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf3.plp.expressions2.memory.VariavelNaoDeclaradaException;

/**
 * Expressão fictícia usada para simular argumentos com tipos específicos na checagem de tipo.
 */
public class ExpressaoDummy implements Expressao {

    private final Tipo tipo;

    public ExpressaoDummy(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public Valor avaliar(AmbienteExecucao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        throw new UnsupportedOperationException("ExpressaoDummy não deve ser avaliada.");
    }

    @Override
    public boolean checaTipo(AmbienteCompilacao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        return true;
    }

    @Override
    public Tipo getTipo(AmbienteCompilacao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        return tipo;
    }

    @Override
    public Expressao reduzir(AmbienteExecucao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        return this;
    }

    @Override
    public Expressao clone() {
        return this;
    }

    @Override
    public String toString() {
        return "<dummy:" + tipo + ">";
    }
}
