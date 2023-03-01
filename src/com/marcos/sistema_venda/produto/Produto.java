package produto;

public class Produto {
    
    private int id_produto;
    private String descricao_produto;
    private double valor_produto;
    
    public void setId_produto(int id_produto){
        this.id_produto = id_produto;
    }

    public void setDescricao_pŕoduto(String descricao_produto){
        this.descricao_produto = descricao_produto;
    }

    public void setValor_pŕoduto(double valor_produto){
        this.valor_produto = valor_produto;
    }

    public int getId_produto(){
        return id_produto;
    }

    public String getDescricao_produto(){
        return descricao_produto;
    }

    public double getValor_produto(){
        return valor_produto;
    }

    void cadastrar_produto()
}
