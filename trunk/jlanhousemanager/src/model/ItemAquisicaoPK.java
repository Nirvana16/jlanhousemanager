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
public class ItemAquisicaoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "iditemaquisicao")
    private int iditemaquisicao;
    @Basic(optional = false)
    @Column(name = "idaquisicao")
    private int idaquisicao;

    public ItemAquisicaoPK() {
    }

    public ItemAquisicaoPK(int iditemaquisicao, int idaquisicao) {
        this.iditemaquisicao = iditemaquisicao;
        this.idaquisicao = idaquisicao;
    }

    public int getIditemaquisicao() {
        return iditemaquisicao;
    }

    public void setIditemaquisicao(int iditemaquisicao) {
        this.iditemaquisicao = iditemaquisicao;
    }

    public int getIdaquisicao() {
        return idaquisicao;
    }

    public void setIdaquisicao(int idaquisicao) {
        this.idaquisicao = idaquisicao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iditemaquisicao;
        hash += (int) idaquisicao;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemAquisicaoPK)) {
            return false;
        }
        ItemAquisicaoPK other = (ItemAquisicaoPK) object;
        if (this.iditemaquisicao != other.iditemaquisicao) {
            return false;
        }
        if (this.idaquisicao != other.idaquisicao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ItemAquisicaoPK[iditemaquisicao=" + iditemaquisicao + ", idaquisicao=" + idaquisicao + "]";
    }

}
