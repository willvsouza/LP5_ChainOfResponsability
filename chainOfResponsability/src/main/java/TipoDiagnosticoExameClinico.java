public class TipoDiagnosticoExameClinico implements TipoDiagnostico {

    private static TipoDiagnosticoExameClinico tipoDiagnosticoExameClinico = new TipoDiagnosticoExameClinico();

    private TipoDiagnosticoExameClinico() {};

    public static TipoDiagnosticoExameClinico getTipoDiagnosticoExameClinico() {
        return tipoDiagnosticoExameClinico;
    }
}
