public class DoisNum2 {
    //propriedade classe DoisNum
    private int A;
    private int B;

    //construtor
    DoisNum2(int X, int Y){
        A =X;
        B = Y;
    }
    DoisNum2 (int X){
        A = X;
        B = X;
    }
    DoisNum2()
    {

    }
    // METODOS E CLASSE
    public void EntraA (int X)
    { A = X; }
    public void EntraB (int X)
    { B = X; }
    public int RetA()
    { return A;}
    public int RetB()
    { return B;}
    public int Soma()
    { return A + B;}
    public int Subtrai()
    { return A-B;}
    public int Multiplica()
    { return A * B;}
    public int Divide()
    { return A/B;}
}
