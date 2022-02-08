public class TipoSolicitacaoCancelamento implements TipoSolicitacao{
    private static TipoSolicitacaoCancelamento tipoSolicitacaoReclamacao = new TipoSolicitacaoCancelamento();

    private TipoSolicitacaoCancelamento() {};

    public static TipoSolicitacaoCancelamento getTipoSolicitacaoReclamacao() {
        return tipoSolicitacaoReclamacao;
    }
}
