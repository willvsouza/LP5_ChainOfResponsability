public class FuncionarioClinicoGeral extends Funcionario {

    public FuncionarioClinicoGeral(Funcionario superior) {
        listaDiagnosticos.add(TipoDiagnosticoRemoto.getTipoDiagnosticoRemoto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Clínico geral";
    }
}
