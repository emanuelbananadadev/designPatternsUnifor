package facadeContext;

import interfaceStategy.StrategyInterfacePagamento;

public class ContextoPagamento {
    private StrategyInterfacePagamento interfacePagamento;

    public ContextoPagamento(StrategyInterfacePagamento interfacePagamento) {
        this.interfacePagamento = interfacePagamento;
    }

    public void executarPagamento(double montante) {
        interfacePagamento.pagar(montante);
    }
}
