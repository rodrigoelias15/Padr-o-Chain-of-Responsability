public class TipoSolicitacaoSuporteTecnico implements TipoSolicitacao {
    private static TipoSolicitacaoSuporteTecnico tipoSolicitacaoSuporteTecnico = new TipoSolicitacaoSuporteTecnico();

    private TipoSolicitacaoSuporteTecnico() {};

    public static TipoSolicitacaoSuporteTecnico getTipoSolicitacaoSuporteTecnico() {
        return tipoSolicitacaoSuporteTecnico;
    }
}
