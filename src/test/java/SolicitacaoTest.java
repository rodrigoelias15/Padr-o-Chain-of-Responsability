import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoTest {
    FuncionarioSetorCancelamento atendenteCancelamento;
    FuncionarioSetorReclamacao atendenteReclamacao;
    FuncionarioSetorSuporteTecnico atentendeSuporteTecnico;

    @BeforeEach
    void setUp() {
        atentendeSuporteTecnico = new FuncionarioSetorSuporteTecnico(null);
        atendenteCancelamento = new FuncionarioSetorCancelamento(atentendeSuporteTecnico);
        atendenteReclamacao = new FuncionarioSetorReclamacao(atendenteCancelamento);
    }

    @Test
    void deveRetornarAtendenteParaAtenderReclamacao() {
        assertEquals("Setor de reclamação", atendenteReclamacao.atenderSolicitacao(new
                Solicitacao(TipoSolicitacaoReclamacao.getTipoSolicitacaoReclamacao())));
    }

    @Test
    void deveRetornarAtendenteParaAtenderCancelamento() {
        assertEquals("Setor de Cancelamento", atendenteReclamacao.atenderSolicitacao(new
                Solicitacao(TipoSolicitacaoCancelamento.getTipoSolicitacaoCancelamento())));
    }

    @Test
    void deveRetornarAtendenteParaAtenderSuporteTecnico() {
        assertEquals("Suporte Técnico", atendenteReclamacao.atenderSolicitacao(new
                Solicitacao(TipoSolicitacaoSuporteTecnico.getTipoSolicitacaoSuporteTecnico())));
    }
}