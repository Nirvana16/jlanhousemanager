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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tales
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
    @SequenceGenerator(name="seqAquisicao", allocationSize=1, sequenceName="aquisicao_idaquisicao_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAquisicao" )
    @Basic(optional = false)
    @Column(name = "idaquisicao")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @JoinColumn(name = "idfornecedor", referencedColumnName = "idfornecedor")
    @ManyToOne(optional = false)
    private Fornecedor fornecedor;

    public Aquisicao() {
    }

    public Aquisicao(Integer idaquisicao) {
        this.id = idaquisicao;
    }

    public Aquisicao(Integer idaquisicao, Date data, BigDecimal valor) {
        this.id = idaquisicao;
        this.data = data;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idaquisicao) {
        this.id = idaquisicao;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor idfornecedor) {
        this.fornecedor = idfornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aquisicao)) {
            return false;
        }
        Aquisicao other = (Aquisicao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Aquisicao[idaquisicao=" + id + "]";
    }

}
