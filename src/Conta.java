import java.util.ArrayList;
import java.util.List;

public class Conta {
  private String numeroConta;
  private Cliente titular;
  private List<Dependente> dependentes = new ArrayList<>();

  public List<Dependente> getDependente() {
    return dependentes; // Retorna a lista de dependentes
  }

  public void setDependente(Dependente dependente) {
    this.dependentes.add(dependente);
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Conta: " + numeroConta + "\n");
    sb.append("Titular: " + titular.getNome() + "\n");
    sb.append("Dependentes:\n");

    for (Dependente dependente : dependentes) {
      sb.append("- " + dependente.getNome() + "\n");
    }

    return sb.toString();
  }
}