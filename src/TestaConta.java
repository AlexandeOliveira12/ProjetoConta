public class TestaConta {
  public static void main(String[] args) {
    // Criação do cliente
    Cliente cliente01 = new Cliente();
    cliente01.setCodigo(1);
    cliente01.setNome("Marcelo");

    // Criação dos dependentes
    Dependente dep01 = new Dependente();
    dep01.setCodigo(1);
    dep01.setNome("Gabriel");

    Dependente dep02 = new Dependente();
    dep02.setCodigo(2);
    dep02.setNome("Gustavo");

    Conta conta01 = new Conta();
    conta01.setNumeroConta("01232425");
    conta01.setTitular(cliente01);
    conta01.setDependente(dep01);
    conta01.setDependente(dep02);

    Cliente cliente02 = new Cliente();
    cliente02.setCodigo(2);
    cliente02.setNome("Luciana");

    conta01.setTitular(cliente02);

    for (Dependente dependente: conta01.getDependente()) {
      System.out.printf("Código: %d \n Nome: %s \n\n", dependente.getCodigo(), dependente.getNome());
    }

    System.out.println(conta01);
  }
}