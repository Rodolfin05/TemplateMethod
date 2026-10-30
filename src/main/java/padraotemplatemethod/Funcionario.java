package padraotemplatemethod;

public abstract class Funcionario {

    private int matricula;
    protected String nome;
    private float salarioBase;
    private int metasAtingidas;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getMetasAtingidas() {
        return metasAtingidas;
    }

    public void setMetasAtingidas(int metasAtingidas) {
        this.metasAtingidas = metasAtingidas;
    }

    public float calcularSalario() {
        return this.salarioBase + this.calcularBonificacao();
    }

    public abstract float calcularBonificacao();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", salario=" + this.calcularSalario() +
                '}';
    }
}
