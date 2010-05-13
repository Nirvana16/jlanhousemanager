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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "despesafixa")
@NamedQueries({
    @NamedQuery(name = "Despesafixa.findAll", query = "SELECT d FROM Despesafixa d"),
    @NamedQuery(name = "Despesafixa.findByIddespesafixa", query = "SELECT d FROM Despesafixa d WHERE d.iddespesafixa = :iddespesafixa"),
    @NamedQuery(name = "Despesafixa.findByData", query = "SELECT d FROM Despesafixa d WHERE d.data = :data"),
    @NamedQuery(name = "Despesafixa.findByValor", query = "SELECT d FROM Despesafixa d WHERE d.valor = :valor"),
    @NamedQuery(name = "Despesafixa.findByMesreferencia", query = "SELECT d FROM Despesafixa d WHERE d.mesreferencia = :mesreferencia")})
public class Despesafixa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddespesafixa")
    private Integer iddespesafixa;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "mesreferencia")
    private int mesreferencia;
    @JoinColumn(name = "idtipodespesa", referencedColumnName = "idtipodespesa")
    @ManyToOne(optional = false)
    private Tipodespesa idtipodespesa;

    public Despesafixa() {
    }

    public Despesafixa(Integer iddespesafixa) {
        this.iddespesafixa = iddespesafixa;
    }

    public Despesafixa(Integer iddespesafixa, Date data, BigDecimal valor, int mesreferencia) {
        this.iddespesafixa = iddespesafixa;
        this.data = data;
        this.valor = valor;
        this.mesreferencia = mesreferencia;
    }

    public Integer getIddespesafixa() {
        return iddespesafixa;
    }

    public void setIddespesafixa(Integer iddespesafixa) {
        this.iddespesafixa = iddespesafixa;
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

    public int getMesreferencia() {
        return mesreferencia;
    }

    public void setMesreferencia(int mesreferencia) {
        this.mesreferencia = mesreferencia;
    }

    public Tipodespesa getIdtipodespesa() {
        return idtipodespesa;
    }

    public void setIdtipodespesa(Tipodespesa idtipodespesa) {
        this.idtipodespesa = idtipodespesa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddespesafixa != null ? iddespesafixa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Despesafixa)) {
            return false;
        }
        Despesafixa other = (Despesafixa) object;
        if ((this.iddespesafixa == null && other.iddespesafixa != null) || (this.iddespesafixa != null && !this.iddespesafixa.equals(other.iddespesafixa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Despesafixa[iddespesafixa=" + iddespesafixa + "]";
    }

}
