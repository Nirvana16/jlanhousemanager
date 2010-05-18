/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;
import model.DespesaFixa;
import model.DespesaVariavel;
import model.Fornecedor;
import model.Funcionario;
import model.Produto;
import model.TipoDespesa;

/**
 *
 * @author Danilo
 */
public class SessionFacadeImpl implements SessionFacade{

    private ClienteService clienteServ;
    private FuncionarioService funcionarioServ;
    private FornecedorService fornecedorServ;
    private ProdutoService produtoServ;
    private TipoDespesaService tipoDespesaServ;
    private DespesaFixaService despesaFixaServ;
    private DespesaVariavelService despesaVariavelServ;

    public SessionFacadeImpl() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jlanhousemanagerPU");
        EntityManager em = emf.createEntityManager();

        clienteServ = new ClienteService(em);
        funcionarioServ = new FuncionarioService(em);
        fornecedorServ = new FornecedorService(em);
        produtoServ = new ProdutoService(em);
        tipoDespesaServ = new TipoDespesaService(em);
        despesaFixaServ = new DespesaFixaService(em, this);
        despesaVariavelServ = new DespesaVariavelService(em);
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteServ.addClient(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteServ.getClients();
    }

    public void cadastrarFuncionario(Funcionario func) {
        funcionarioServ.addFuncionario(func);
    }

    public void cadastrarFornecedor(Fornecedor forn) {
        fornecedorServ.addFornecedor(forn);
    }

    public void cadastrarProduto(Produto prod) {
        produtoServ.addProduto(prod);
    }

    public void cadastrarTipoDespesa(TipoDespesa tipo) {
        tipoDespesaServ.addTipoDespesa(tipo);
    }

    public TipoDespesa pegarTipoDespesa(int id) {
        return tipoDespesaServ.findTipoDespesa(id);
    }

    public void cadastrarDespesaFixa(DespesaFixa desp) throws ServiceException {
        despesaFixaServ.addDespesa(desp);
    }

    public void cadastrarDespesaVariavel(DespesaVariavel desp) {
        despesaVariavelServ.addDespesa(desp);
    }

}
