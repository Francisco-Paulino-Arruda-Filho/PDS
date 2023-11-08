public class Pizza35 implements IFabrica{
    public void criarPizza(String tipo){
        if(tipo.equals("Mussarela")){
            Mussarela m = new Mussarela();
        }else if(tipo.equals("portuguesa")){
            Portuguesa p = new Portuguesa();
        }else if(tipo.equals("calabresa")){
            Calabresa c = new Calabresa();
        }
    }
}
