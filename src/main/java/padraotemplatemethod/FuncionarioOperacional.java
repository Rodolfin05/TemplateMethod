package padraotemplatemethod;

public class FuncionarioOperacional extends Funcionario {

    public float calcularBonificacao() {
        if (this.getMetasAtingidas() >= 3) {
            return this.getMetasAtingidas() * 100.0f;
        }
        else {
            return 0.0f;
        }
    }

}
