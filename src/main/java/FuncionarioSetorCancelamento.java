public class FuncionarioSetorCancelamento extends Funcionario{
    public FuncionarioSetorCancelamento(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoCancelamento.getTipoSolicitacaoReclamacao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Setor de Cancelamento";
    }
}
