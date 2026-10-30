package padraotemplatemethod;

public class FuncionarioGerente extends Funcionario {

    public float calcularBonificacao() {
        if (this.getMetasAtingidas() >= 5) {
            return this.getSalarioBase() * 0.2f;
        }
        else {
            return this.getSalarioBase() * 0.05f;
        }
    }

    @Override
    public String getTipo() {
        return "Gerente";
    }
}
