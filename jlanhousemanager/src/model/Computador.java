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
@Table(name = "computador")
@NamedQueries({
    @NamedQuery(name = "Computador.findAll", query = "SELECT c FROM Computador c"),
    @NamedQuery(name = "Computador.findByNumeropc", query = "SELECT c FROM Computador c WHERE c.numeropc = :numeropc"),
    @NamedQuery(name = "Computador.findByDescso", query = "SELECT c FROM Computador c WHERE c.descso = :descso"),
    @NamedQuery(name = "Computador.findByDescplacamae", query = "SELECT c FROM Computador c WHERE c.descplacamae = :descplacamae"),
    @NamedQuery(name = "Computador.findByDescprocessador", query = "SELECT c FROM Computador c WHERE c.descprocessador = :descprocessador"),
    @NamedQuery(name = "Computador.findByDescmemoria", query = "SELECT c FROM Computador c WHERE c.descmemoria = :descmemoria"),
    @NamedQuery(name = "Computador.findByClockprocessador", query = "SELECT c FROM Computador c WHERE c.clockprocessador = :clockprocessador"),
    @NamedQuery(name = "Computador.findByTammemoria", query = "SELECT c FROM Computador c WHERE c.tammemoria = :tammemoria"),
    @NamedQuery(name = "Computador.findByTamhd", query = "SELECT c FROM Computador c WHERE c.tamhd = :tamhd")})
public class Computador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numeropc")
    private Integer numeropc;
    @Basic(optional = false)
    @Column(name = "descso")
    private String descso;
    @Basic(optional = false)
    @Column(name = "descplacamae")
    private String descplacamae;
    @Basic(optional = false)
    @Column(name = "descprocessador")
    private String descprocessador;
    @Basic(optional = false)
    @Column(name = "descmemoria")
    private String descmemoria;
    @Basic(optional = false)
    @Column(name = "clockprocessador")
    private double clockprocessador;
    @Basic(optional = false)
    @Column(name = "tammemoria")
    private int tammemoria;
    @Basic(optional = false)
    @Column(name = "tamhd")
    private int tamhd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeropc")
    private List<UsoDoComputador> usoDoComputadorList;

    public Computador() {
    }

    public Computador(Integer numeropc) {
        this.numeropc = numeropc;
    }

    public Computador(Integer numeropc, String descso, String descplacamae, String descprocessador, String descmemoria, double clockprocessador, int tammemoria, int tamhd) {
        this.numeropc = numeropc;
        this.descso = descso;
        this.descplacamae = descplacamae;
        this.descprocessador = descprocessador;
        this.descmemoria = descmemoria;
        this.clockprocessador = clockprocessador;
        this.tammemoria = tammemoria;
        this.tamhd = tamhd;
    }

    public Integer getNumeropc() {
        return numeropc;
    }

    public void setNumeropc(Integer numeropc) {
        this.numeropc = numeropc;
    }

    public String getDescso() {
        return descso;
    }

    public void setDescso(String descso) {
        this.descso = descso;
    }

    public String getDescplacamae() {
        return descplacamae;
    }

    public void setDescplacamae(String descplacamae) {
        this.descplacamae = descplacamae;
    }

    public String getDescprocessador() {
        return descprocessador;
    }

    public void setDescprocessador(String descprocessador) {
        this.descprocessador = descprocessador;
    }

    public String getDescmemoria() {
        return descmemoria;
    }

    public void setDescmemoria(String descmemoria) {
        this.descmemoria = descmemoria;
    }

    public double getClockprocessador() {
        return clockprocessador;
    }

    public void setClockprocessador(double clockprocessador) {
        this.clockprocessador = clockprocessador;
    }

    public int getTammemoria() {
        return tammemoria;
    }

    public void setTammemoria(int tammemoria) {
        this.tammemoria = tammemoria;
    }

    public int getTamhd() {
        return tamhd;
    }

    public void setTamhd(int tamhd) {
        this.tamhd = tamhd;
    }

    public List<UsoDoComputador> getUsoDoComputadorList() {
        return usoDoComputadorList;
    }

    public void setUsoDoComputadorList(List<UsoDoComputador> usoDoComputadorList) {
        this.usoDoComputadorList = usoDoComputadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeropc != null ? numeropc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Computador)) {
            return false;
        }
        Computador other = (Computador) object;
        if ((this.numeropc == null && other.numeropc != null) || (this.numeropc != null && !this.numeropc.equals(other.numeropc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Computador[numeropc=" + numeropc + "]";
    }

}
