public class Fabrica2 implements IFabrica{
    public void produzir(String tipo){
        if(tipo.equals("A")){
            A_Fabrica2 a = new A_Fabrica2();
        }else if(tipo.equals("B")){
            B_Fabrica2 b = new B_Fabrica2();
        }else if(tipo.equals("C")){
            C_Fabrica2 c = new C_Fabrica2();
        }else{
            System.out.println("Tipo inválido");
        }
    }
}
