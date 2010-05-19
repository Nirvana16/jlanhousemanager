/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
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
@Table(name = "conta")
@NamedQueries({
    @NamedQuery(name = "Conta.findAll", query = "SELECT c FROM Conta c"),
    @NamedQuery(name = "Conta.findByIdconta", query = "SELECT c FROM Conta c WHERE c.idconta = :idconta"),
    @NamedQuery(name = "Conta.findByData", query = "SELECT c FROM Conta c WHERE c.data = :data"),
    @NamedQuery(name = "Conta.findBySituacao", query = "SELECT c FROM Conta c WHERE c.situacao = :situacao")})
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idconta")
    private Integer idconta;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente idcliente;
    @JoinColumn(name = "idfuncionario", referencedColumnName = "idfuncionario")
    @ManyToOne(optional = false)
    private Funcionario idfuncionario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conta")
    private List<ItemDaConta> itemDaContaList;

    public Conta() {
    }

    public Conta(Integer idconta) {
        this.idconta = idconta;
    }

    public Conta(Integer idconta, Date data, String situacao) {
        this.idconta = idconta;
        this.data = data;
        this.situacao = situacao;
    }

    public Integer getIdconta() {
        return idconta;
    }

    public void setIdconta(Integer idconta) {
        this.idconta = idconta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public List<ItemDaConta> getItemDaContaList() {
        return itemDaContaList;
    }

    public void setItemDaContaList(List<ItemDaConta> itemDaContaList) {
        this.itemDaContaList = itemDaContaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconta != null ? idconta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.idconta == null && other.idconta != null) || (this.idconta != null && !this.idconta.equals(other.idconta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Conta[idconta=" + idconta + "]";
    }

}
