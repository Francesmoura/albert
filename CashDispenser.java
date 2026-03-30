// CashDispenser.java
// Representa o dispensador de cédulas do ATM
public class CashDispenser {
    //O número inicial padrão de células no dispensador de célula
    private final static int inicial_count = 500;
    private int count; // número de células de USS 20 remanescente

    // Construtor sem argumentos CashDispenser inicializar a count para o padrão
    public CashDispenser() {
        count = inicial_count; //Configura atributo count como o padrão
        } // fim do construtor Cash Dispenser

        //Simula a entrega do quantia especifica de células
        public void dispenserCash(int amount) {
            int billsRequired = amount / 20; // número de USS 20 requerido
            count -= billsRequired;  // atualiza a contagem das células
            
        } // fim do método dispenserCash

        //indica se o dispensador de células pode enregar a quantia desejada
    public boolean isSufficientCashAvailable (int amount) {
        int billsRequired =  amount /20; // número de células de USS 20 requerido
        return count >= billsRequired; // se há ou não células sufucientes disponíveis
    } // fim do método insSufficientCashAvalible

    
} // fim classe CashDispenser