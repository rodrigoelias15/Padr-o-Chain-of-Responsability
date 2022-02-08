public class FuncionarioSetorSuporteTecnico extends Funcionario{
    public FuncionarioSetorSuporteTecnico(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoSuporteTecnico.getTipoSolicitacaoSuporteTecnico());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte Técnico";
    }
}
