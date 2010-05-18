/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByIdfornecedor", query = "SELECT f FROM Fornecedor f WHERE f.idfornecedor = :idfornecedor"),
    @NamedQuery(name = "Fornecedor.findByNome", query = "SELECT f FROM Fornecedor f WHERE f.nome = :nome"),
    @NamedQuery(name = "Fornecedor.findByCpnj", query = "SELECT f FROM Fornecedor f WHERE f.cpnj = :cpnj"),
    @NamedQuery(name = "Fornecedor.findByTelefone", query = "SELECT f FROM Fornecedor f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Fornecedor.findByEndrua", query = "SELECT f FROM Fornecedor f WHERE f.endrua = :endrua"),
    @NamedQuery(name = "Fornecedor.findByEndbairro", query = "SELECT f FROM Fornecedor f WHERE f.endbairro = :endbairro"),
    @NamedQuery(name = "Fornecedor.findByEndnumero", query = "SELECT f FROM Fornecedor f WHERE f.endnumero = :endnumero"),
    @NamedQuery(name = "Fornecedor.findByEndcidade", query = "SELECT f FROM Fornecedor f WHERE f.endcidade = :endcidade"),
    @NamedQuery(name = "Fornecedor.findByEndestado", query = "SELECT f FROM Fornecedor f WHERE f.endestado = :endestado"),
    @NamedQuery(name = "Fornecedor.findByEndcep", query = "SELECT f FROM Fornecedor f WHERE f.endcep = :endcep")})
public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="seqFornecedor", allocationSize=1, sequenceName="fornecedor_idfornecedor_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqFornecedor" )
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpnj")
    private String cpnj;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "endrua")
    private String endrua;
    @Basic(optional = false)
    @Column(name = "endbairro")
    private String endbairro;
    @Basic(optional = false)
    @Column(name = "endnumero")
    private int endnumero;
    @Basic(optional = false)
    @Column(name = "endcidade")
    private String endcidade;
    @Basic(optional = false)
    @Column(name = "endestado")
    private String endestado;
    @Basic(optional = false)
    @Column(name = "endcep")
    private String endcep;

    public Fornecedor() {
    }

    public Fornecedor(Integer idfornecedor) {
        this.id = idfornecedor;
    }

    public Fornecedor(Integer idfornecedor, String nome, String cpnj, String telefone, String endrua, String endbairro, int endnumero, String endcidade, String endestado, String endcep) {
        this.id = idfornecedor;
        this.nome = nome;
        this.cpnj = cpnj;
        this.telefone = telefone;
        this.endrua = endrua;
        this.endbairro = endbairro;
        this.endnumero = endnumero;
        this.endcidade = endcidade;
        this.endestado = endestado;
        this.endcep = endcep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idfornecedor) {
        this.id = idfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndrua() {
        return endrua;
    }

    public void setEndrua(String endrua) {
        this.endrua = endrua;
    }

    public String getEndbairro() {
        return endbairro;
    }

    public void setEndbairro(String endbairro) {
        this.endbairro = endbairro;
    }

    public int getEndnumero() {
        return endnumero;
    }

    public void setEndnumero(int endnumero) {
        this.endnumero = endnumero;
    }

    public String getEndcidade() {
        return endcidade;
    }

    public void setEndcidade(String endcidade) {
        this.endcidade = endcidade;
    }

    public String getEndestado() {
        return endestado;
    }

    public void setEndestado(String endestado) {
        this.endestado = endestado;
    }

    public String getEndcep() {
        return endcep;
    }

    public void setEndcep(String endcep) {
        this.endcep = endcep;
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
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Fornecedor[idfornecedor=" + id + "]";
    }

}
