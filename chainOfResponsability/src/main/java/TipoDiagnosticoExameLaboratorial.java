public class TipoDiagnosticoExameLaboratorial implements TipoDiagnostico {

    private static TipoDiagnosticoExameLaboratorial tipoDiagnosticoExameLaboratorial = new TipoDiagnosticoExameLaboratorial();

    private TipoDiagnosticoExameLaboratorial() {};

    public static TipoDiagnosticoExameLaboratorial getTipoDiagnosticoExameLaboratorial() {
        return tipoDiagnosticoExameLaboratorial;
    }
}
