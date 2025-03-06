package negocioStrategy;

import interfaceStategy.StrategyInterfacePagamento;

public class PagamentoPicPay implements StrategyInterfacePagamento {
    private String email;

    public PagamentoPicPay(String email) {
        this.email = email;
    }

    @Override
    public void pagar(double montante) {
    System.out.println("Pagamento de R$" + montante +  " realizado com sucesso: via PicPay: (" + email + ")");
    }
}
