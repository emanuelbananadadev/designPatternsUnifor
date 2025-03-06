package negocioFactory;

import interfaceStategy.StrategyInterfacePagamento;
import negocioStrategy.PagamentoCrediCard;
import negocioStrategy.PagamentoPicPay;

import java.util.Locale;

public class PagamentoFactory {
    public static StrategyInterfacePagamento criarPagamento(String tipo, String identificacao, String nome) {

        switch (tipo.toLowerCase()) {
            case "cartaocredito":
                return new PagamentoCrediCard(identificacao, nome);
            case "picpay":
                return  new PagamentoPicPay(identificacao);
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido");
        }
    }
}
