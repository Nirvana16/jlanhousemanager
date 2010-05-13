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
 * @author Danilo
 */
@Entity
@Table(name = "tipodespesa")
@NamedQueries({
    @NamedQuery(name = "Tipodespesa.findAll", query = "SELECT t FROM Tipodespesa t"),
    @NamedQuery(name = "Tipodespesa.findByIdtipodespesa", query = "SELECT t FROM Tipodespesa t WHERE t.idtipodespesa = :idtipodespesa"),
    @NamedQuery(name = "Tipodespesa.findByDescricao", query = "SELECT t FROM Tipodespesa t WHERE t.descricao = :descricao")})
public class Tipodespesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtipodespesa")
    private Integer idtipodespesa;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipodespesa")
    private List<Despesafixa> despesafixaList;

    public Tipodespesa() {
    }

    public Tipodespesa(Integer idtipodespesa) {
        this.idtipodespesa = idtipodespesa;
    }

    public Tipodespesa(Integer idtipodespesa, String descricao) {
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

    public List<Despesafixa> getDespesafixaList() {
        return despesafixaList;
    }

    public void setDespesafixaList(List<Despesafixa> despesafixaList) {
        this.despesafixaList = despesafixaList;
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
        if (!(object instanceof Tipodespesa)) {
            return false;
        }
        Tipodespesa other = (Tipodespesa) object;
        if ((this.idtipodespesa == null && other.idtipodespesa != null) || (this.idtipodespesa != null && !this.idtipodespesa.equals(other.idtipodespesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tipodespesa[idtipodespesa=" + idtipodespesa + "]";
    }

}
