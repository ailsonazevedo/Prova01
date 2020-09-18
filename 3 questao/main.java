
public class main {

    public static void main(String[] args) 
    {

        Triangulo t1 = new Triangulo();

        t1.setLadoA(18);
        t1.setLadoB(9);
        t1.setLadoC(3);

        t1.verificar();

        t1.NomeTriangulo(); // Mostra qual trinagulo é
    }
}