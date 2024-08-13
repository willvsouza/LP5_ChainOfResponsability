public class TipoDiagnosticoImagem implements TipoDiagnostico {

    private static TipoDiagnosticoImagem tipoDiagnosticoImagem = new TipoDiagnosticoImagem();

    private TipoDiagnosticoImagem() {};

    public static TipoDiagnosticoImagem getTipoDiagnosticoImagem() {
        return tipoDiagnosticoImagem;
    }
}
