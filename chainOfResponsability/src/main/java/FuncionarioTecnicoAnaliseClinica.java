public class FuncionarioTecnicoAnaliseClinica extends Funcionario {

    public FuncionarioTecnicoAnaliseClinica(Funcionario superior) {
        listaDiagnosticos.add(TipoDiagnosticoExameLaboratorial.getTipoDiagnosticoExameLaboratorial());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Técnico em análises clínicas";
    }
}
