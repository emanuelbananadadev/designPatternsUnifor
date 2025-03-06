package negocioStrategy;

import interfaceStategy.StrategyInterfacePagamento;

public class PagamentoCrediCard implements StrategyInterfacePagamento {
    private String numeroCartao;
    private String nomeUsuario;

    public PagamentoCrediCard(String numeroCartao, String nomeUsuario) {
        this.numeroCartao = numeroCartao;
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void pagar(double montante) {
        System.out.println("Pagamento de R$" + montante + " realizado com sucesso via credCard: (" + numeroCartao+ ") em nome de " + nomeUsuario);
    }
}
