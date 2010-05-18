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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
    @SequenceGenerator(name="seqTipoDespesa", allocationSize=1, sequenceName="tipodespesa_idtipodespesa_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqTipoDespesa" )
    @Basic(optional = false)
    @Column(name = "idtipodespesa")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipodespesa")
    private List<DespesaFixa> despesaFixaList;

    public TipoDespesa() {
    }

    public TipoDespesa(Integer idtipodespesa) {
        this.id = idtipodespesa;
    }

    public TipoDespesa(Integer idtipodespesa, String descricao) {
        this.id = idtipodespesa;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idtipodespesa) {
        this.id = idtipodespesa;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDespesa)) {
            return false;
        }
        TipoDespesa other = (TipoDespesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TipoDespesa[idtipodespesa=" + id + "]";
    }

}
