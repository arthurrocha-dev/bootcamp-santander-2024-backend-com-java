public class Conta {

  private int accountNumber;
  private int accountAgency;
  private String clientName;
  private double accountBalance;

  public Conta(int numero, int agency, String clientName) {
    this.accountNumber = numero;
    this.accountAgency = agency;
    this.clientName = clientName;
  }

  public boolean withdraw(double amount) {
    if (amount > 0 && amount <= accountBalance) {
      accountBalance -= amount;
      return true;
    }
    return false;
  }
  public void deposit(double amount) {
    if (amount > 0) {
      accountBalance += amount;
    }
  }

  public boolean transfer(Conta destinationAccount, double amount) {
    if (this.withdraw(amount)) {
      destinationAccount.deposit(amount);
      return true;
    }
    return false;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public int getAccountAgency() {
    return accountAgency;
  }

  public String getClientName() {
    return clientName;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public String confirmAccountCreation() {
    return String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %d, conta %d e seu saldo de %.2f já está disponível para saque.",
      this.clientName, this.accountAgency, this.accountNumber, this.accountBalance);
  }
}
