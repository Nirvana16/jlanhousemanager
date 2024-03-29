/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "aquisicao")
@NamedQueries({
    @NamedQuery(name = "Aquisicao.findAll", query = "SELECT a FROM Aquisicao a"),
    @NamedQuery(name = "Aquisicao.findByIdaquisicao", query = "SELECT a FROM Aquisicao a WHERE a.idaquisicao = :idaquisicao"),
    @NamedQuery(name = "Aquisicao.findByData", query = "SELECT a FROM Aquisicao a WHERE a.data = :data"),
    @NamedQuery(name = "Aquisicao.findByValor", query = "SELECT a FROM Aquisicao a WHERE a.valor = :valor")})
public class Aquisicao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idaquisicao")
    private Integer idaquisicao;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aquisicao")
    private List<ItemAquisicao> itemAquisicaoList;
    @JoinColumn(name = "idfornecedor", referencedColumnName = "idfornecedor")
    @ManyToOne(optional = false)
    private Fornecedor idfornecedor;

    public Aquisicao() {
    }

    public Aquisicao(Integer idaquisicao) {
        this.idaquisicao = idaquisicao;
    }

    public Aquisicao(Integer idaquisicao, Date data, BigDecimal valor) {
        this.idaquisicao = idaquisicao;
        this.data = data;
        this.valor = valor;
    }

    public Integer getIdaquisicao() {
        return idaquisicao;
    }

    public void setIdaquisicao(Integer idaquisicao) {
        this.idaquisicao = idaquisicao;
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

    public List<ItemAquisicao> getItemAquisicaoList() {
        return itemAquisicaoList;
    }

    public void setItemAquisicaoList(List<ItemAquisicao> itemAquisicaoList) {
        this.itemAquisicaoList = itemAquisicaoList;
    }

    public Fornecedor getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Fornecedor idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaquisicao != null ? idaquisicao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aquisicao)) {
            return false;
        }
        Aquisicao other = (Aquisicao) object;
        if ((this.idaquisicao == null && other.idaquisicao != null) || (this.idaquisicao != null && !this.idaquisicao.equals(other.idaquisicao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Aquisicao[idaquisicao=" + idaquisicao + "]";
    }

}
