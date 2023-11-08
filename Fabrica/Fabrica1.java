public class Fabrica1 implements IFabrica{
    public void produzir(String tipo){
        if(tipo.equals("A")){
           A_Fabrica1 a = new A_Fabrica1();
        }else if(tipo.equals("B")){
            B_Fabrica1 b = new B_Fabrica1();
        }else if(tipo.equals("C")){
            C_Fabrica1 c = new C_Fabrica1();
        }else{
            System.out.println("Tipo inválido");
        }
    }
}
