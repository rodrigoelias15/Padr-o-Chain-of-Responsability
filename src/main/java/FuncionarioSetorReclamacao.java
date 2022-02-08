public class FuncionarioSetorReclamacao extends Funcionario{
    public FuncionarioSetorReclamacao(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoReclamacao.getTipoSolicitacaoReclamacao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Setor de reclamação";
    }
}
