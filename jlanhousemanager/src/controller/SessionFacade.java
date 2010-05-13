/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Cliente;
import model.Fornecedor;
import model.Funcionario;

/**
 *
 * @author Danilo
 */
public interface SessionFacade {
    public void cadastrarCliente( Cliente c );

    public void cadastrarFuncionario( Funcionario func );

    public void cadastrarFornecedor( Fornecedor forn );
}
