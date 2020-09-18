public class Triangulo {
    
    private float LadoA;
    private float LadoB;
    private float LadoC;
    
    private boolean triangulo;

    

    public boolean isTriangulo() {
        return triangulo;
    }

    public void setTriangulo(boolean triangulo) {
        this.triangulo = triangulo;
    }

    public void verificar() {
        if ((LadoA < (LadoB + LadoC))) 
        {
            if (LadoB < (LadoA + LadoC)) 
            {
                if (LadoC < (LadoA + LadoB)) 
                {
                    this.setTriangulo(true);
                }
            }
        }
    }
    public void NomeTriangulo(){
        if(isTriangulo() == true){
            System.out.println(this.isTriangulo());
            if(LadoA != LadoB && LadoB!= LadoC && LadoA != LadoC) 
            { 
                System.out.println("1");
            }
            else if(LadoA == LadoB || LadoB == LadoC || LadoA == LadoC)
            { 
                System.out.println("2");
            }
            else if(LadoA == LadoB && LadoB == LadoC && LadoA == LadoC)
            { 
                System.out.println("3");
            }
            else
                {
                    System.out.println("0"); //Inválido
                }
        }
        else 
            {
                System.out.println(this.isTriangulo());
            }
    }

    public float getLadoA() {
        return LadoA;
    }

    public void setLadoA(float ladoA) {
        LadoA = ladoA;
    }

    public float getLadoB() {
        return LadoB;
    }

    public void setLadoB(float ladoB) {
        LadoB = ladoB;
    }

    public float getLadoC() {
        return LadoC;
    }

    public void setLadoC(float ladoC) {
        LadoC = ladoC;
    }
}

