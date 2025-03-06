import facadeContext.ContextoPagamento;
import interfaceStategy.StrategyInterfacePagamento;
import negocioFactory.PagamentoFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando pagamento");
        //Usando factory para criar estratégias de pagamento
        StrategyInterfacePagamento cartaoCredito = PagamentoFactory.criarPagamento("cartaoCredito", "123456", "Ramos");

        StrategyInterfacePagamento pagamentoPix = PagamentoFactory.criarPagamento("picPay", "ramos@email.com", null);

        //USando strategy para processar o pagamento
        ContextoPagamento contexto1 = new ContextoPagamento(cartaoCredito);
        contexto1.executarPagamento(2563.0);
        ContextoPagamento contexto2 = new ContextoPagamento(pagamentoPix);
        contexto2.executarPagamento(589.0);
    }
}