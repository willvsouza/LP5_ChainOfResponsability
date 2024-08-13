import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaDiagnosticos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String realizarDiagnostico (Diagnostico diagnostico) {
        if (listaDiagnosticos.contains(diagnostico.getTipoDiagnostico())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.realizarDiagnostico(diagnostico);
            }
            else
            {
                return "Sem diagnóstico";
            }
        }
    }
}
