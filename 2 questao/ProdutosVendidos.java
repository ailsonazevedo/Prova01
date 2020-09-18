import java.util.Scanner;

public class ProdutosVendidos {

    private String NomeDoProduto;
    private float PrecoDoProduto;
    private int QuantidadeEstoque;

    Scanner entrada = new Scanner(System.in);

    public ProdutosVendidos(String NomeDoProduto, float PrecoDoProduto, int QuantidadeEstoque )
    {

    }


    public String getNomeDoProduto() {
        return NomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        NomeDoProduto = nomeDoProduto;
    }

    public float getPrecoDoProduto() {
        return PrecoDoProduto;
    }

    public void setPrecoDoProduto(float precoDoProduto) {
        PrecoDoProduto = precoDoProduto;
    }

    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        QuantidadeEstoque = quantidadeEstoque;
    }
    public void AdicionarProduto(String NomeDoProduto, float PrecoDoProduto, int QuantidadeEstoque)
    {
        String nome;
        float preco;
        int quantidade;
        System.out.println("Nome do produto: ");
        nome = entrada.nextLine();
        this.setNomeDoProduto(nome);
        System.out.println("Preço do produto: ");
        preco = entrada.nextFloat();
        this.setNomeDoProduto(nome);
        System.out.println("Quantidade de produtos: ");
        quantidade = entrada.nextInt();
        this.setQuantidadeEstoque(quantidade);

    }

    public void ListaEstoque()
    {
        System.out.println("Nome: "+ getNomeDoProduto());
        System.out.println("Preço: "+getPrecoDoProduto());
        System.out.println("Quantidade em estoque: "+ getQuantidadeEstoque());
    }
    
}