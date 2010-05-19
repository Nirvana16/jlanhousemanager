/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Danilo
 */
@Embeddable
public class ItemDaContaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "iditemdaconta")
    private long iditemdaconta;
    @Basic(optional = false)
    @Column(name = "idconta")
    private int idconta;

    public ItemDaContaPK() {
    }

    public ItemDaContaPK(long iditemdaconta, int idconta) {
        this.iditemdaconta = iditemdaconta;
        this.idconta = idconta;
    }

    public long getIditemdaconta() {
        return iditemdaconta;
    }

    public void setIditemdaconta(long iditemdaconta) {
        this.iditemdaconta = iditemdaconta;
    }

    public int getIdconta() {
        return idconta;
    }

    public void setIdconta(int idconta) {
        this.idconta = idconta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iditemdaconta;
        hash += (int) idconta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemDaContaPK)) {
            return false;
        }
        ItemDaContaPK other = (ItemDaContaPK) object;
        if (this.iditemdaconta != other.iditemdaconta) {
            return false;
        }
        if (this.idconta != other.idconta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ItemDaContaPK[iditemdaconta=" + iditemdaconta + ", idconta=" + idconta + "]";
    }

}
