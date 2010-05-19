/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "itemaquisicao")
@NamedQueries({
    @NamedQuery(name = "ItemAquisicao.findAll", query = "SELECT i FROM ItemAquisicao i"),
    @NamedQuery(name = "ItemAquisicao.findByIditemaquisicao", query = "SELECT i FROM ItemAquisicao i WHERE i.itemAquisicaoPK.iditemaquisicao = :iditemaquisicao"),
    @NamedQuery(name = "ItemAquisicao.findByIdaquisicao", query = "SELECT i FROM ItemAquisicao i WHERE i.itemAquisicaoPK.idaquisicao = :idaquisicao"),
    @NamedQuery(name = "ItemAquisicao.findByQuantidade", query = "SELECT i FROM ItemAquisicao i WHERE i.quantidade = :quantidade"),
    @NamedQuery(name = "ItemAquisicao.findByPreco", query = "SELECT i FROM ItemAquisicao i WHERE i.preco = :preco")})
public class ItemAquisicao implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemAquisicaoPK itemAquisicaoPK;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Column(name = "preco")
    private BigDecimal preco;
    @JoinColumn(name = "idaquisicao", referencedColumnName = "idaquisicao", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Aquisicao aquisicao;
    @JoinColumn(name = "idproduto", referencedColumnName = "idproduto")
    @ManyToOne(optional = false)
    private Produto idproduto;

    public ItemAquisicao() {
    }

    public ItemAquisicao(ItemAquisicaoPK itemAquisicaoPK) {
        this.itemAquisicaoPK = itemAquisicaoPK;
    }

    public ItemAquisicao(ItemAquisicaoPK itemAquisicaoPK, int quantidade, BigDecimal preco) {
        this.itemAquisicaoPK = itemAquisicaoPK;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public ItemAquisicao(int iditemaquisicao, int idaquisicao) {
        this.itemAquisicaoPK = new ItemAquisicaoPK(iditemaquisicao, idaquisicao);
    }

    public ItemAquisicaoPK getItemAquisicaoPK() {
        return itemAquisicaoPK;
    }

    public void setItemAquisicaoPK(ItemAquisicaoPK itemAquisicaoPK) {
        this.itemAquisicaoPK = itemAquisicaoPK;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Aquisicao getAquisicao() {
        return aquisicao;
    }

    public void setAquisicao(Aquisicao aquisicao) {
        this.aquisicao = aquisicao;
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
        hash += (itemAquisicaoPK != null ? itemAquisicaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemAquisicao)) {
            return false;
        }
        ItemAquisicao other = (ItemAquisicao) object;
        if ((this.itemAquisicaoPK == null && other.itemAquisicaoPK != null) || (this.itemAquisicaoPK != null && !this.itemAquisicaoPK.equals(other.itemAquisicaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ItemAquisicao[itemAquisicaoPK=" + itemAquisicaoPK + "]";
    }

}
