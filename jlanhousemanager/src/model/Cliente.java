/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

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
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="seqCliente", allocationSize=1, sequenceName="cliente_idcliente_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCliente" )
    @Basic(optional = false)
    @Column(name = "idcliente")
    private Integer id;
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

    public Cliente() {
    }

    public Cliente(Integer idcliente) {
        this.id = idcliente;
    }

    public Cliente(Integer idcliente, String nome, String cpf, Date datanascimento, String endrua, String endbairro, int endnumero, String endcidade, String endestado, String endcep) {
        this.id = idcliente;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer idcliente) {
        Integer oldIdcliente = this.id;
        this.id = idcliente;
        changeSupport.firePropertyChange("idcliente", oldIdcliente, idcliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        Date oldDatanascimento = this.datanascimento;
        this.datanascimento = datanascimento;
        changeSupport.firePropertyChange("datanascimento", oldDatanascimento, datanascimento);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTelresidencial() {
        return telresidencial;
    }

    public void setTelresidencial(String telresidencial) {
        String oldTelresidencial = this.telresidencial;
        this.telresidencial = telresidencial;
        changeSupport.firePropertyChange("telresidencial", oldTelresidencial, telresidencial);
    }

    public String getTelcelular() {
        return telcelular;
    }

    public void setTelcelular(String telcelular) {
        String oldTelcelular = this.telcelular;
        this.telcelular = telcelular;
        changeSupport.firePropertyChange("telcelular", oldTelcelular, telcelular);
    }

    public String getEndrua() {
        return endrua;
    }

    public void setEndrua(String endrua) {
        String oldEndrua = this.endrua;
        this.endrua = endrua;
        changeSupport.firePropertyChange("endrua", oldEndrua, endrua);
    }

    public String getEndbairro() {
        return endbairro;
    }

    public void setEndbairro(String endbairro) {
        String oldEndbairro = this.endbairro;
        this.endbairro = endbairro;
        changeSupport.firePropertyChange("endbairro", oldEndbairro, endbairro);
    }

    public int getEndnumero() {
        return endnumero;
    }

    public void setEndnumero(int endnumero) {
        int oldEndnumero = this.endnumero;
        this.endnumero = endnumero;
        changeSupport.firePropertyChange("endnumero", oldEndnumero, endnumero);
    }

    public String getEndcidade() {
        return endcidade;
    }

    public void setEndcidade(String endcidade) {
        String oldEndcidade = this.endcidade;
        this.endcidade = endcidade;
        changeSupport.firePropertyChange("endcidade", oldEndcidade, endcidade);
    }

    public String getEndestado() {
        return endestado;
    }

    public void setEndestado(String endestado) {
        String oldEndestado = this.endestado;
        this.endestado = endestado;
        changeSupport.firePropertyChange("endestado", oldEndestado, endestado);
    }

    public String getEndcep() {
        return endcep;
    }

    public void setEndcep(String endcep) {
        String oldEndcep = this.endcep;
        this.endcep = endcep;
        changeSupport.firePropertyChange("endcep", oldEndcep, endcep);
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cliente[idcliente=" + id + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
