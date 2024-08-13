public class FuncionarioTecnicoRadiologia extends Funcionario {

    public FuncionarioTecnicoRadiologia(Funcionario superior) {
        listaDiagnosticos.add(TipoDiagnosticoImagem.getTipoDiagnosticoImagem());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Técnico em radiologia";
    }
}
