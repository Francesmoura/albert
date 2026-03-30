public abstract class Transaction {
    // Variáveis privadas (Encapsulamento)
    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;

    /**
     * Construtor da Classe Abstrata Transaction
     * @param userAccountNumber O número da conta do usuário
     * @param atmScreen Referência à tela do ATM
     * @param atmBankDatabase Referência ao banco de dados do banco
     */
    public Transaction(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        this.accountNumber = userAccountNumber;
        this.screen = atmScreen;
        this.bankDatabase = atmBankDatabase;
    }

    // Métodos Getters (Acessores)
    public int getAccountNumber() {
        return accountNumber;
    }

    public Screen getScreen() {
        return screen;
    }

    public BankDatabase getBankDatabase() {
        return bankDatabase;
    }

    /**
     * Método abstrato: Força as classes filhas (BalanceInquiry, Withdrawal, etc.)
     * a implementarem sua própria lógica de execução.
     */
    public abstract void execute();
}