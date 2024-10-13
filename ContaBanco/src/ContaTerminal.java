public class ContaTerminal {

  int number;
  String agency;
  String clientName;
  float balance;
  
  public ContaTerminal() {
  }

  public ContaTerminal(int number, String agency, String clientName, float balance) {
    this.number = number;
    this.agency = agency;
    this.clientName = clientName;
    this.balance = balance;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int numero) {
    this.number = numero;
  }

  public String getAgency() {
    return agency;
  }

  public void setAgency(String agencia) {
    this.agency = agencia;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String nomeCliente) {
    this.clientName = nomeCliente;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float saldo) {
    this.balance = saldo;
  }

  public String greetings() {
    return "Olá " +
           this.clientName +
           ", obrigado por criar uma conta em nosso banco, sua agência é " + 
           this.agency + 
           ", conta " + 
           this.number + 
           " e seu saldo " +
           String.format("%.2f",this.balance) +
           " já está disponível para saque";
  }
}
