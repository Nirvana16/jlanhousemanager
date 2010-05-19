/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdproduto", query = "SELECT p FROM Produto p WHERE p.idproduto = :idproduto"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByQtdestoque", query = "SELECT p FROM Produto p WHERE p.qtdestoque = :qtdestoque"),
    @NamedQuery(name = "Produto.findByPreco", query = "SELECT p FROM Produto p WHERE p.preco = :preco")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idproduto")
    private Integer idproduto;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "qtdestoque")
    private int qtdestoque;
    @Basic(optional = false)
    @Column(name = "preco")
    private BigDecimal preco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproduto")
    private List<ItemAquisicao> itemAquisicaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproduto")
    private List<CompraDeProduto> compraDeProdutoList;

    public Produto() {
    }

    public Produto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Produto(Integer idproduto, String descricao, int qtdestoque, BigDecimal preco) {
        this.idproduto = idproduto;
        this.descricao = descricao;
        this.qtdestoque = qtdestoque;
        this.preco = preco;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdestoque() {
        return qtdestoque;
    }

    public void setQtdestoque(int qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public List<ItemAquisicao> getItemAquisicaoList() {
        return itemAquisicaoList;
    }

    public void setItemAquisicaoList(List<ItemAquisicao> itemAquisicaoList) {
        this.itemAquisicaoList = itemAquisicaoList;
    }

    public List<CompraDeProduto> getCompraDeProdutoList() {
        return compraDeProdutoList;
    }

    public void setCompraDeProdutoList(List<CompraDeProduto> compraDeProdutoList) {
        this.compraDeProdutoList = compraDeProdutoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduto != null ? idproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idproduto == null && other.idproduto != null) || (this.idproduto != null && !this.idproduto.equals(other.idproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produto[idproduto=" + idproduto + "]";
    }

}
