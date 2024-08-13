public class TipoDiagnosticoRemoto implements TipoDiagnostico {

    private static TipoDiagnosticoRemoto tipoDiagnosticoRemoto = new TipoDiagnosticoRemoto();

    private TipoDiagnosticoRemoto() {};

    public static TipoDiagnosticoRemoto getTipoDiagnosticoRemoto() {
        return tipoDiagnosticoRemoto;
    }
}
