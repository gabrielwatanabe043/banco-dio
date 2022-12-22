public class Conta {
  String agencia;
  int numero;
  String nome;
  double saldo;

  public void escolherAgencia(String novaAgencia) {
    agencia = novaAgencia;
  }

  public void escolherNumero(int novaNumero) {
    numero = novaNumero;
  }

  public void escolherNome(String novoNome) {
    nome = novoNome;
  }

  public void escolherSaldo(double novoSaldo) {
    saldo = novoSaldo;
  }
}
