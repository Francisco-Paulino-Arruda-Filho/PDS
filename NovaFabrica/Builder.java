public class Builder {
    public Coisa produzir(int fabrica, String tipo){
        if(fabrica == 1){
            if(tipo.equals("A")){
                return new A_Fabrica1();
             }else if(tipo.equals("B")){
                 return new B_Fabrica1();
             }else if(tipo.equals("C")){
                return new C_Fabrica1();
             }else{
                 return new D_Fabrica1();
             }
        }else{
            if(tipo.equals("A")){
                return new A_Fabrica2();
             }else if(tipo.equals("B")){
                 return new B_Fabrica2();
             }else if(tipo.equals("C")){
                return new C_Fabrica2();
             }else{
                 return new D_Fabrica2();
             }
        }
    }
}