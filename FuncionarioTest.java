import org.junit.Assert;
import org.junit.Test;

public class FuncionarioTest {

    @Test
    public void deveCalcularSalarioCorretamente() {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Luiz");
        funcionario.setHorasExtrasTrabalhadas(10);
        funcionario.setSalarioBase(1500);

        Assert.assertEquals(1590, funcionario.calculaSalario(), 0.0001);
    }
}
