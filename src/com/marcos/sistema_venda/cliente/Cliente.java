package cliente;

// Classe cliente para cadastro dos clientes
public class Cliente{

    private int id_cliente;
    private String nome_cliente;
    private String cpf_cliente;


    public void setId_cliente (int id_cliente){
        this.id_cliente = id_cliente;
    }

    public void setNome_cliente (String nome_cliente){
        this.nome_cliente = nome_cliente;
    }

    public void setCpf_cliente (String cpf_cliente){
        this.cpf_cliente = cpf_cliente;
    }

    public int getId_cliente(){
        return id_cliente;
    }

    public String getNome_cliente(){
        return nome_cliente;
    }

    public String getCpf_cliente(){
        return cpf_cliente;
    }
}