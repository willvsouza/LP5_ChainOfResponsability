import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiagnosticoTeste {

    FuncionarioClinicoGeral funcionarioClinicoGeral;
    FuncionarioMedicoEspecialista funcionarioMedicoEspecialista;
    FuncionarioTecnicoAnaliseClinica funcionarioTecnicoAnaliseClinica;
    FuncionarioTecnicoRadiologia funcionarioTecnicoRadiologia;

    @BeforeEach
    void setUp() {

        funcionarioClinicoGeral = new FuncionarioClinicoGeral(funcionarioTecnicoAnaliseClinica);
        funcionarioTecnicoAnaliseClinica = new FuncionarioTecnicoAnaliseClinica(funcionarioTecnicoRadiologia);
        funcionarioTecnicoRadiologia = new FuncionarioTecnicoRadiologia(funcionarioMedicoEspecialista);
        funcionarioMedicoEspecialista = new FuncionarioMedicoEspecialista(null);
    }

    @Test //shouldReturnFuncionarioClinicoGeralToPerformGeneralDiagnosis
    void deveRetornarFuncionarioClinicoGeralParaRealizarDiagnosticoRemoto() {
        assertEquals("Clínico geral", funcionarioClinicoGeral.realizarDiagnostico(new Diagnostico(TipoDiagnosticoRemoto.getTipoDiagnosticoRemoto())));
    }

    @Test //shouldReturnSpecialistDoctorToPerformSpecialistExam
    void deveRetornarFuncionarioMedicoEspecialistaParaRealizarDiagnosticoExameClinico() {
        assertEquals("Médico especialista", funcionarioMedicoEspecialista.realizarDiagnostico(new Diagnostico(TipoDiagnosticoExameClinico.getTipoDiagnosticoExameClinico())));
    }

    @Test//shouldReturnLaboratoryDoctorToPerformLabExam
    void deveRetornarFuncionarioTecnicoAnaliseClinicaParaRealizarDiagnosticoExameLaboratorial() {
        assertEquals("Técnico em análises clínicas", funcionarioTecnicoAnaliseClinica.realizarDiagnostico(new Diagnostico(TipoDiagnosticoExameLaboratorial.getTipoDiagnosticoExameLaboratorial())));
    }

    @Test //shouldReturnImageExamDoctorToPerformImageExam
    void deveRetornarFuncionarioTecnicoRadiologiaParaRealizarDiagnosticoImagem() {
        assertEquals("Técnico em radiologia", funcionarioTecnicoRadiologia.realizarDiagnostico(new Diagnostico(TipoDiagnosticoImagem.getTipoDiagnosticoImagem())));
    }

    @Test //shouldReturnWithoutDiagnosis
    void deveRetornarSemDiagnostico() {
        assertEquals("Sem diagnóstico", funcionarioClinicoGeral.realizarDiagnostico(new Diagnostico(TipoDiagnosticoExameLaboratorial.getTipoDiagnosticoExameLaboratorial())));
    }
}
