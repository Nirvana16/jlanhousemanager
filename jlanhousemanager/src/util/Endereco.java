/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Danilo
 */
public class Endereco {

    private String rua;
    private int num;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco( String rua, int num, String bairro, String cidade, String estado, String cep ){
        setRua(rua);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setNum(num);
        setCep(cep);
    }


    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param rua the rua to set
     */
    private void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @param num the num to set
     */
    private void setNum(int num) {
        this.num = num;
    }

    /**
     * @param cep the cep to set
     */
    private void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @param bairro the bairro to set
     */
    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @param cidade the cidade to set
     */
    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @param estado the estado to set
     */
    private void setEstado(String estado) {
        this.estado = estado;
    }

    

}
