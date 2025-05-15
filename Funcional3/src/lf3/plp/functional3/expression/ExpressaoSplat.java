package lf3.plp.functional3.expression;

import lf3.plp.expressions1.util.Tipo;
import lf3.plp.expressions2.expression.Expressao;
import lf3.plp.expressions2.expression.Valor;
import lf3.plp.expressions2.memory.AmbienteCompilacao;
import lf3.plp.expressions2.memory.AmbienteExecucao;
import lf3.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf3.plp.expressions2.memory.VariavelNaoDeclaradaException;
import lf3.plp.functional3.expression.ValorLista;
import lf3.plp.functional3.util.TipoLista;


/**
 * Representa uma expressão com o operador splat (*expr)
 */
public class ExpressaoSplat implements Expressao {

    private Expressao expressao;

    public ExpressaoSplat(Expressao expressao) {
        this.expressao = expressao;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    @Override
    public Valor avaliar(AmbienteExecucao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        Valor valor = expressao.avaliar(ambiente);
        if (!(valor instanceof ValorLista)) {
            throw new RuntimeException("Expressão splat deve avaliar para uma lista.");
        }
        return valor;
    }

    @Override
    public boolean checaTipo(AmbienteCompilacao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        if (!expressao.checaTipo(ambiente)) return false;
        return expressao.getTipo(ambiente) instanceof TipoLista;
    }

    @Override
    public Tipo getTipo(AmbienteCompilacao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        return expressao.getTipo(ambiente);
    }

    @Override
    public Expressao reduzir(AmbienteExecucao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        // Imutável: gera novo nó
        return new ExpressaoSplat(expressao.reduzir(ambiente));
    }

    @Override
    public Expressao clone() {
        return new ExpressaoSplat(expressao.clone());
    }

    @Override
    public String toString() {
        return "*" + expressao.toString();
    }
}