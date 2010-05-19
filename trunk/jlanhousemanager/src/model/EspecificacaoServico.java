/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "especificacaoservico")
@NamedQueries({
    @NamedQuery(name = "EspecificacaoServico.findAll", query = "SELECT e FROM EspecificacaoServico e"),
    @NamedQuery(name = "EspecificacaoServico.findByIdespecificacaoservico", query = "SELECT e FROM EspecificacaoServico e WHERE e.idespecificacaoservico = :idespecificacaoservico"),
    @NamedQuery(name = "EspecificacaoServico.findByDescricao", query = "SELECT e FROM EspecificacaoServico e WHERE e.descricao = :descricao"),
    @NamedQuery(name = "EspecificacaoServico.findByPreco", query = "SELECT e FROM EspecificacaoServico e WHERE e.preco = :preco"),
    @NamedQuery(name = "EspecificacaoServico.findByUnidade", query = "SELECT e FROM EspecificacaoServico e WHERE e.unidade = :unidade")})
public class EspecificacaoServico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idespecificacaoservico")
    private Integer idespecificacaoservico;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "preco")
    private BigDecimal preco;
    @Basic(optional = false)
    @Column(name = "unidade")
    private int unidade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecificacaoservico")
    private List<ExecucaoDeServico> execucaoDeServicoList;

    public EspecificacaoServico() {
    }

    public EspecificacaoServico(Integer idespecificacaoservico) {
        this.idespecificacaoservico = idespecificacaoservico;
    }

    public EspecificacaoServico(Integer idespecificacaoservico, String descricao, BigDecimal preco, int unidade) {
        this.idespecificacaoservico = idespecificacaoservico;
        this.descricao = descricao;
        this.preco = preco;
        this.unidade = unidade;
    }

    public Integer getIdespecificacaoservico() {
        return idespecificacaoservico;
    }

    public void setIdespecificacaoservico(Integer idespecificacaoservico) {
        this.idespecificacaoservico = idespecificacaoservico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public List<ExecucaoDeServico> getExecucaoDeServicoList() {
        return execucaoDeServicoList;
    }

    public void setExecucaoDeServicoList(List<ExecucaoDeServico> execucaoDeServicoList) {
        this.execucaoDeServicoList = execucaoDeServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecificacaoservico != null ? idespecificacaoservico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecificacaoServico)) {
            return false;
        }
        EspecificacaoServico other = (EspecificacaoServico) object;
        if ((this.idespecificacaoservico == null && other.idespecificacaoservico != null) || (this.idespecificacaoservico != null && !this.idespecificacaoservico.equals(other.idespecificacaoservico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.EspecificacaoServico[idespecificacaoservico=" + idespecificacaoservico + "]";
    }

}
