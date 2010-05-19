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
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdcliente", query = "SELECT c FROM Cliente c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByDatanascimento", query = "SELECT c FROM Cliente c WHERE c.datanascimento = :datanascimento"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email"),
    @NamedQuery(name = "Cliente.findByTelresidencial", query = "SELECT c FROM Cliente c WHERE c.telresidencial = :telresidencial"),
    @NamedQuery(name = "Cliente.findByTelcelular", query = "SELECT c FROM Cliente c WHERE c.telcelular = :telcelular"),
    @NamedQuery(name = "Cliente.findByEndrua", query = "SELECT c FROM Cliente c WHERE c.endrua = :endrua"),
    @NamedQuery(name = "Cliente.findByEndbairro", query = "SELECT c FROM Cliente c WHERE c.endbairro = :endbairro"),
    @NamedQuery(name = "Cliente.findByEndnumero", query = "SELECT c FROM Cliente c WHERE c.endnumero = :endnumero"),
    @NamedQuery(name = "Cliente.findByEndcidade", query = "SELECT c FROM Cliente c WHERE c.endcidade = :endcidade"),
    @NamedQuery(name = "Cliente.findByEndestado", query = "SELECT c FROM Cliente c WHERE c.endestado = :endestado"),
    @NamedQuery(name = "Cliente.findByEndcep", query = "SELECT c FROM Cliente c WHERE c.endcep = :endcep")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcliente")
    private Integer idcliente;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Column(name = "email")
    private String email;
    @Column(name = "telresidencial")
    private String telresidencial;
    @Column(name = "telcelular")
    private String telcelular;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcliente")
    private List<Conta> contaList;

    public Cliente() {
    }

    public Cliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Cliente(Integer idcliente, String nome, String cpf, Date datanascimento, String endrua, String endbairro, int endnumero, String endcidade, String endestado, String endcep) {
        this.idcliente = idcliente;
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.endrua = endrua;
        this.endbairro = endbairro;
        this.endnumero = endnumero;
        this.endcidade = endcidade;
        this.endestado = endestado;
        this.endcep = endcep;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelresidencial() {
        return telresidencial;
    }

    public void setTelresidencial(String telresidencial) {
        this.telresidencial = telresidencial;
    }

    public String getTelcelular() {
        return telcelular;
    }

    public void setTelcelular(String telcelular) {
        this.telcelular = telcelular;
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

    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcliente != null ? idcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idcliente == null && other.idcliente != null) || (this.idcliente != null && !this.idcliente.equals(other.idcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cliente[idcliente=" + idcliente + "]";
    }

}
