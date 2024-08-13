public class FuncionarioMedicoEspecialista extends Funcionario {

    public FuncionarioMedicoEspecialista(Funcionario superior) {
        listaDiagnosticos.add(TipoDiagnosticoExameClinico.getTipoDiagnosticoExameClinico());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico especialista";
    }
}
