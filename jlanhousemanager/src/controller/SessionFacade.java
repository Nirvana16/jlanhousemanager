/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
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
public interface SessionFacade {

    public void cadastrarCliente( Cliente c );
    public List<Cliente> listarClientes();

    public void cadastrarFuncionario( Funcionario funcionario );

    public void cadastrarFornecedor( Fornecedor fornecedor );

    public void cadastrarProduto( Produto produto );

    public void cadastrarTipoDespesa( TipoDespesa tipo );
    public TipoDespesa pegarTipoDespesa( int id );

    public void cadastrarDespesaFixa( DespesaFixa despesa ) throws ServiceException;

    public void cadastrarDespesaVariavel( DespesaVariavel despesa );
}
