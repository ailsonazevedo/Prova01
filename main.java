public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;
 
        
        ArrayList<ProdutosVendidos> produtos = new ArrayList<ProdutosVendidos>();
        ProdutosVendidos p = new ProdutosVendidos("",0.0f,0);
        System.out.println("1 - Adcionar produto ");
        System.out.println("2 - Lista de Estoque ");
        System.out.println("Digite a opçao: ");

        opcao = entrada.nextInt();
        switch (opcao)
        {
            case 1:
                while(opcao == 1)
                {
                    p.AdicionarProduto("",0.0f,0);

                }
            break;
            case 2:
                p.ListaEstoque();
            break;

        }

       

    }
}