/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "usodocomputador")
@NamedQueries({
    @NamedQuery(name = "UsoDoComputador.findAll", query = "SELECT u FROM UsoDoComputador u"),
    @NamedQuery(name = "UsoDoComputador.findByIdusodocomputador", query = "SELECT u FROM UsoDoComputador u WHERE u.idusodocomputador = :idusodocomputador"),
    @NamedQuery(name = "UsoDoComputador.findByHorainicial", query = "SELECT u FROM UsoDoComputador u WHERE u.horainicial = :horainicial"),
    @NamedQuery(name = "UsoDoComputador.findByHorafim", query = "SELECT u FROM UsoDoComputador u WHERE u.horafim = :horafim"),
    @NamedQuery(name = "UsoDoComputador.findByHoraencerrada", query = "SELECT u FROM UsoDoComputador u WHERE u.horaencerrada = :horaencerrada")})
public class UsoDoComputador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idusodocomputador")
    private Integer idusodocomputador;
    @Basic(optional = false)
    @Column(name = "horainicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horainicial;
    @Basic(optional = false)
    @Column(name = "horafim")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafim;
    @Basic(optional = false)
    @Column(name = "horaencerrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaencerrada;
    @JoinColumn(name = "numeropc", referencedColumnName = "numeropc")
    @ManyToOne(optional = false)
    private Computador numeropc;
    @JoinColumns({
        @JoinColumn(name = "iditemdaconta", referencedColumnName = "iditemdaconta"),
        @JoinColumn(name = "idconta", referencedColumnName = "idconta")})
    @ManyToOne(optional = false)
    private ItemDaConta itemDaConta;

    public UsoDoComputador() {
    }

    public UsoDoComputador(Integer idusodocomputador) {
        this.idusodocomputador = idusodocomputador;
    }

    public UsoDoComputador(Integer idusodocomputador, Date horainicial, Date horafim, Date horaencerrada) {
        this.idusodocomputador = idusodocomputador;
        this.horainicial = horainicial;
        this.horafim = horafim;
        this.horaencerrada = horaencerrada;
    }

    public Integer getIdusodocomputador() {
        return idusodocomputador;
    }

    public void setIdusodocomputador(Integer idusodocomputador) {
        this.idusodocomputador = idusodocomputador;
    }

    public Date getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(Date horainicial) {
        this.horainicial = horainicial;
    }

    public Date getHorafim() {
        return horafim;
    }

    public void setHorafim(Date horafim) {
        this.horafim = horafim;
    }

    public Date getHoraencerrada() {
        return horaencerrada;
    }

    public void setHoraencerrada(Date horaencerrada) {
        this.horaencerrada = horaencerrada;
    }

    public Computador getNumeropc() {
        return numeropc;
    }

    public void setNumeropc(Computador numeropc) {
        this.numeropc = numeropc;
    }

    public ItemDaConta getItemDaConta() {
        return itemDaConta;
    }

    public void setItemDaConta(ItemDaConta itemDaConta) {
        this.itemDaConta = itemDaConta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusodocomputador != null ? idusodocomputador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsoDoComputador)) {
            return false;
        }
        UsoDoComputador other = (UsoDoComputador) object;
        if ((this.idusodocomputador == null && other.idusodocomputador != null) || (this.idusodocomputador != null && !this.idusodocomputador.equals(other.idusodocomputador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.UsoDoComputador[idusodocomputador=" + idusodocomputador + "]";
    }

}
