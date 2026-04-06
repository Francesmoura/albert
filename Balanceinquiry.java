// BalanceInquiry.java
// Representa uma transação de consulta de saldos no ATM

public class BalanceInquiry extends Transaction {

    // Construtor de Balanceinquiry
    public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        super(userAccountNumber, atmScreen, atmBankDatabase) ;
    } // fim do contrutor de BalanceInquiry

    @Override
    public void execute() {
        // obtém as referências ao banco de dados a tela do banco
        BankDatabase bankDatabase = getBankDatabase() ;
        Screen screen = getScreen() ;

        // obtém o saldo disponível da conta envolvida
        double avaliableBalance = bankDatabase.getAvaliableBalance(getAccountNumber()) ;
        
        // obtém o saldo total da conta envolvida
        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber()) ;

        // exibe as informações sobre o saldo na tela
        screen.displayMessageLine("\nBalance Information: ");
        screen.displayMessage(" - Avaliable balance: ");
        screen.displayDollarAmount(avaliableBalance);
        screen.displayMessage("\n - Total balance....: ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessageLine("");
    } //fim do método execute
} // fim da classe BalanceInquiry