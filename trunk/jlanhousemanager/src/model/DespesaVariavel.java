/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "despesavariavel")
@NamedQueries({
    @NamedQuery(name = "DespesaVariavel.findAll", query = "SELECT d FROM DespesaVariavel d"),
    @NamedQuery(name = "DespesaVariavel.findByIddespesavariavel", query = "SELECT d FROM DespesaVariavel d WHERE d.iddespesavariavel = :iddespesavariavel"),
    @NamedQuery(name = "DespesaVariavel.findByData", query = "SELECT d FROM DespesaVariavel d WHERE d.data = :data"),
    @NamedQuery(name = "DespesaVariavel.findByValor", query = "SELECT d FROM DespesaVariavel d WHERE d.valor = :valor"),
    @NamedQuery(name = "DespesaVariavel.findByDescricao", query = "SELECT d FROM DespesaVariavel d WHERE d.descricao = :descricao")})
public class DespesaVariavel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddespesavariavel")
    private Integer iddespesavariavel;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;

    public DespesaVariavel() {
    }

    public DespesaVariavel(Integer iddespesavariavel) {
        this.iddespesavariavel = iddespesavariavel;
    }

    public DespesaVariavel(Integer iddespesavariavel, Date data, BigDecimal valor, String descricao) {
        this.iddespesavariavel = iddespesavariavel;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Integer getIddespesavariavel() {
        return iddespesavariavel;
    }

    public void setIddespesavariavel(Integer iddespesavariavel) {
        this.iddespesavariavel = iddespesavariavel;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddespesavariavel != null ? iddespesavariavel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DespesaVariavel)) {
            return false;
        }
        DespesaVariavel other = (DespesaVariavel) object;
        if ((this.iddespesavariavel == null && other.iddespesavariavel != null) || (this.iddespesavariavel != null && !this.iddespesavariavel.equals(other.iddespesavariavel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DespesaVariavel[iddespesavariavel=" + iddespesavariavel + "]";
    }

}
