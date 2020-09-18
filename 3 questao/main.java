
public class main {

    public static void main(String[] args) 
    {

        Triangulo t = new Triangulo();

        t.setLadoA(18);
        t.setLadoB(9);
        t.setLadoC(3);

        t.verificar();

        t.NomeTriangulo(); // Mostra qual trinagulo é
    }
}