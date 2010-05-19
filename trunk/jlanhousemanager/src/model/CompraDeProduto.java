/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
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

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "compradeproduto")
@NamedQueries({
    @NamedQuery(name = "CompraDeProduto.findAll", query = "SELECT c FROM CompraDeProduto c"),
    @NamedQuery(name = "CompraDeProduto.findByIdcompradeproduto", query = "SELECT c FROM CompraDeProduto c WHERE c.idcompradeproduto = :idcompradeproduto"),
    @NamedQuery(name = "CompraDeProduto.findByQuantidade", query = "SELECT c FROM CompraDeProduto c WHERE c.quantidade = :quantidade")})
public class CompraDeProduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcompradeproduto")
    private Integer idcompradeproduto;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @JoinColumns({
        @JoinColumn(name = "iditemdaconta", referencedColumnName = "iditemdaconta"),
        @JoinColumn(name = "idconta", referencedColumnName = "idconta")})
    @ManyToOne(optional = false)
    private ItemDaConta itemDaConta;
    @JoinColumn(name = "idproduto", referencedColumnName = "idproduto")
    @ManyToOne(optional = false)
    private Produto idproduto;

    public CompraDeProduto() {
    }

    public CompraDeProduto(Integer idcompradeproduto) {
        this.idcompradeproduto = idcompradeproduto;
    }

    public CompraDeProduto(Integer idcompradeproduto, int quantidade) {
        this.idcompradeproduto = idcompradeproduto;
        this.quantidade = quantidade;
    }

    public Integer getIdcompradeproduto() {
        return idcompradeproduto;
    }

    public void setIdcompradeproduto(Integer idcompradeproduto) {
        this.idcompradeproduto = idcompradeproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemDaConta getItemDaConta() {
        return itemDaConta;
    }

    public void setItemDaConta(ItemDaConta itemDaConta) {
        this.itemDaConta = itemDaConta;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcompradeproduto != null ? idcompradeproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraDeProduto)) {
            return false;
        }
        CompraDeProduto other = (CompraDeProduto) object;
        if ((this.idcompradeproduto == null && other.idcompradeproduto != null) || (this.idcompradeproduto != null && !this.idcompradeproduto.equals(other.idcompradeproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CompraDeProduto[idcompradeproduto=" + idcompradeproduto + "]";
    }

}
