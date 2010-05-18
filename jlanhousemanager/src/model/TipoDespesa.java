/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
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
 * @author Tales
 */
@Entity
@Table(name = "tipodespesa")
@NamedQueries({
    @NamedQuery(name = "TipoDespesa.findAll", query = "SELECT t FROM TipoDespesa t"),
    @NamedQuery(name = "TipoDespesa.findByIdtipodespesa", query = "SELECT t FROM TipoDespesa t WHERE t.idtipodespesa = :idtipodespesa"),
    @NamedQuery(name = "TipoDespesa.findByDescricao", query = "SELECT t FROM TipoDespesa t WHERE t.descricao = :descricao")})
public class TipoDespesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtipodespesa")
    private Integer idtipodespesa;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipodespesa")
    private List<DespesaFixa> despesaFixaList;

    public TipoDespesa() {
    }

    public TipoDespesa(Integer idtipodespesa) {
        this.idtipodespesa = idtipodespesa;
    }

    public TipoDespesa(Integer idtipodespesa, String descricao) {
        this.idtipodespesa = idtipodespesa;
        this.descricao = descricao;
    }

    public Integer getIdtipodespesa() {
        return idtipodespesa;
    }

    public void setIdtipodespesa(Integer idtipodespesa) {
        this.idtipodespesa = idtipodespesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<DespesaFixa> getDespesaFixaList() {
        return despesaFixaList;
    }

    public void setDespesaFixaList(List<DespesaFixa> despesaFixaList) {
        this.despesaFixaList = despesaFixaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipodespesa != null ? idtipodespesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDespesa)) {
            return false;
        }
        TipoDespesa other = (TipoDespesa) object;
        if ((this.idtipodespesa == null && other.idtipodespesa != null) || (this.idtipodespesa != null && !this.idtipodespesa.equals(other.idtipodespesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TipoDespesa[idtipodespesa=" + idtipodespesa + "]";
    }

}
