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
@Table(name = "funcionario")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByIdfuncionario", query = "SELECT f FROM Funcionario f WHERE f.idfuncionario = :idfuncionario"),
    @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome"),
    @NamedQuery(name = "Funcionario.findByCpf", query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf"),
    @NamedQuery(name = "Funcionario.findByEmail", query = "SELECT f FROM Funcionario f WHERE f.email = :email"),
    @NamedQuery(name = "Funcionario.findByTelresidencial", query = "SELECT f FROM Funcionario f WHERE f.telresidencial = :telresidencial"),
    @NamedQuery(name = "Funcionario.findByTelcelular", query = "SELECT f FROM Funcionario f WHERE f.telcelular = :telcelular"),
    @NamedQuery(name = "Funcionario.findByEndrua", query = "SELECT f FROM Funcionario f WHERE f.endrua = :endrua"),
    @NamedQuery(name = "Funcionario.findByEndbairro", query = "SELECT f FROM Funcionario f WHERE f.endbairro = :endbairro"),
    @NamedQuery(name = "Funcionario.findByEndnumero", query = "SELECT f FROM Funcionario f WHERE f.endnumero = :endnumero"),
    @NamedQuery(name = "Funcionario.findByEndcidade", query = "SELECT f FROM Funcionario f WHERE f.endcidade = :endcidade"),
    @NamedQuery(name = "Funcionario.findByEndestado", query = "SELECT f FROM Funcionario f WHERE f.endestado = :endestado"),
    @NamedQuery(name = "Funcionario.findByEndcep", query = "SELECT f FROM Funcionario f WHERE f.endcep = :endcep")})
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="seqFuncionario", allocationSize=1, sequenceName="funcionario_idfuncionario_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqFuncionario" )
    @Basic(optional = false)
    @Column(name = "idfuncionario")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
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

    public Funcionario() {
    }

    public Funcionario(Integer idfuncionario) {
        this.id = idfuncionario;
    }

    public Funcionario(Integer idfuncionario, String nome, String cpf, String endrua, String endbairro, int endnumero, String endcidade, String endestado, String endcep) {
        this.id = idfuncionario;
        this.nome = nome;
        this.cpf = cpf;
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

    public void setId(Integer idfuncionario) {
        this.id = idfuncionario;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Funcionario[idfuncionario=" + id + "]";
    }

}
