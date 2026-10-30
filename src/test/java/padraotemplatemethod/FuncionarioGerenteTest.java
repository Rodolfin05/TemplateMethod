package padraotemplatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioGerenteTest {

    @Test
    void deveRetornarSalarioComBonificacaoMaxima() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(10000.0f);
        funcionario.setMetasAtingidas(5);
        assertEquals(12000.0f, funcionario.calcularSalario());
    }

    @Test
    void deveRetornarSalarioComBonificacaoMinima() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(10000.0f);
        funcionario.setMetasAtingidas(4);
        assertEquals(10500.0f, funcionario.calcularSalario());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(10000.0f);
        funcionario.setMetasAtingidas(5);
        funcionario.setNome("Carlos");
        funcionario.setMatricula(1);
        assertEquals("Gerente{matricula=1, nome='Carlos', salario=12000.0}", funcionario.getInfo());
    }
}
