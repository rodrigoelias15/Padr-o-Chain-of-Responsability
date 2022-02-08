public class TipoSolicitacaoReclamacao implements TipoSolicitacao{
    private static TipoSolicitacaoReclamacao tipoSolicitacaoReclamacao = new TipoSolicitacaoReclamacao();

    private TipoSolicitacaoReclamacao() {};

    public static TipoSolicitacaoReclamacao getTipoSolicitacaoReclamacao() {
        return tipoSolicitacaoReclamacao;
    }
}
