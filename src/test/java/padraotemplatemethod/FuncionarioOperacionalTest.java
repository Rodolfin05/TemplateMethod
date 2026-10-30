package padraotemplatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioOperacionalTest {

    @Test
    void deveRetornarSalarioComBonificacao() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setSalarioBase(2000.0f);
        funcionario.setMetasAtingidas(3);
        assertEquals(2300.0f, funcionario.calcularSalario());
    }

    @Test
    void deveRetornarSalarioSemBonificacao() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setSalarioBase(2000.0f);
        funcionario.setMetasAtingidas(2);
        assertEquals(2000.0f, funcionario.calcularSalario());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setSalarioBase(2000.0f);
        funcionario.setMetasAtingidas(4);
        funcionario.setNome("Ana");
        funcionario.setMatricula(2);
        assertEquals("Funcionario{matricula=2, nome='Ana', salario=2400.0}", funcionario.getInfo());
    }
}
