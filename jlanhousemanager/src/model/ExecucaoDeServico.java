/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "execucaodeservico")
@NamedQueries({
    @NamedQuery(name = "ExecucaoDeServico.findAll", query = "SELECT e FROM ExecucaoDeServico e"),
    @NamedQuery(name = "ExecucaoDeServico.findByIdexecucaodeservico", query = "SELECT e FROM ExecucaoDeServico e WHERE e.idexecucaodeservico = :idexecucaodeservico"),
    @NamedQuery(name = "ExecucaoDeServico.findByQuantidade", query = "SELECT e FROM ExecucaoDeServico e WHERE e.quantidade = :quantidade")})
public class ExecucaoDeServico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idexecucaodeservico")
    private Integer idexecucaodeservico;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @JoinColumn(name = "idespecificacaoservico", referencedColumnName = "idespecificacaoservico")
    @ManyToOne(optional = false)
    private EspecificacaoServico idespecificacaoservico;
    @JoinColumns({
        @JoinColumn(name = "iditemdaconta", referencedColumnName = "iditemdaconta"),
        @JoinColumn(name = "idconta", referencedColumnName = "idconta")})
    @ManyToOne(optional = false)
    private ItemDaConta itemDaConta;

    public ExecucaoDeServico() {
    }

    public ExecucaoDeServico(Integer idexecucaodeservico) {
        this.idexecucaodeservico = idexecucaodeservico;
    }

    public ExecucaoDeServico(Integer idexecucaodeservico, int quantidade) {
        this.idexecucaodeservico = idexecucaodeservico;
        this.quantidade = quantidade;
    }

    public Integer getIdexecucaodeservico() {
        return idexecucaodeservico;
    }

    public void setIdexecucaodeservico(Integer idexecucaodeservico) {
        this.idexecucaodeservico = idexecucaodeservico;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public EspecificacaoServico getIdespecificacaoservico() {
        return idespecificacaoservico;
    }

    public void setIdespecificacaoservico(EspecificacaoServico idespecificacaoservico) {
        this.idespecificacaoservico = idespecificacaoservico;
    }

    public ItemDaConta getItemDaConta() {
        return itemDaConta;
    }

    public void setItemDaConta(ItemDaConta itemDaConta) {
        this.itemDaConta = itemDaConta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idexecucaodeservico != null ? idexecucaodeservico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExecucaoDeServico)) {
            return false;
        }
        ExecucaoDeServico other = (ExecucaoDeServico) object;
        if ((this.idexecucaodeservico == null && other.idexecucaodeservico != null) || (this.idexecucaodeservico != null && !this.idexecucaodeservico.equals(other.idexecucaodeservico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ExecucaoDeServico[idexecucaodeservico=" + idexecucaodeservico + "]";
    }

}
