/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "itemdaconta")
@NamedQueries({
    @NamedQuery(name = "ItemDaConta.findAll", query = "SELECT i FROM ItemDaConta i"),
    @NamedQuery(name = "ItemDaConta.findByIditemdaconta", query = "SELECT i FROM ItemDaConta i WHERE i.itemDaContaPK.iditemdaconta = :iditemdaconta"),
    @NamedQuery(name = "ItemDaConta.findByIdconta", query = "SELECT i FROM ItemDaConta i WHERE i.itemDaContaPK.idconta = :idconta")})
public class ItemDaConta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemDaContaPK itemDaContaPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemDaConta")
    private List<UsoDoComputador> usoDoComputadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemDaConta")
    private List<CompraDeProduto> compraDeProdutoList;
    @JoinColumn(name = "idconta", referencedColumnName = "idconta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Conta conta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemDaConta")
    private List<ExecucaoDeServico> execucaoDeServicoList;

    public ItemDaConta() {
    }

    public ItemDaConta(ItemDaContaPK itemDaContaPK) {
        this.itemDaContaPK = itemDaContaPK;
    }

    public ItemDaConta(long iditemdaconta, int idconta) {
        this.itemDaContaPK = new ItemDaContaPK(iditemdaconta, idconta);
    }

    public ItemDaContaPK getItemDaContaPK() {
        return itemDaContaPK;
    }

    public void setItemDaContaPK(ItemDaContaPK itemDaContaPK) {
        this.itemDaContaPK = itemDaContaPK;
    }

    public List<UsoDoComputador> getUsoDoComputadorList() {
        return usoDoComputadorList;
    }

    public void setUsoDoComputadorList(List<UsoDoComputador> usoDoComputadorList) {
        this.usoDoComputadorList = usoDoComputadorList;
    }

    public List<CompraDeProduto> getCompraDeProdutoList() {
        return compraDeProdutoList;
    }

    public void setCompraDeProdutoList(List<CompraDeProduto> compraDeProdutoList) {
        this.compraDeProdutoList = compraDeProdutoList;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<ExecucaoDeServico> getExecucaoDeServicoList() {
        return execucaoDeServicoList;
    }

    public void setExecucaoDeServicoList(List<ExecucaoDeServico> execucaoDeServicoList) {
        this.execucaoDeServicoList = execucaoDeServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemDaContaPK != null ? itemDaContaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemDaConta)) {
            return false;
        }
        ItemDaConta other = (ItemDaConta) object;
        if ((this.itemDaContaPK == null && other.itemDaContaPK != null) || (this.itemDaContaPK != null && !this.itemDaContaPK.equals(other.itemDaContaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ItemDaConta[itemDaContaPK=" + itemDaContaPK + "]";
    }

}
