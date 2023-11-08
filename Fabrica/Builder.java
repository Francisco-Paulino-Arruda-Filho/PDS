public class Builder {//Fábrica de fábricas
    public void produzirFabrica(String tipo){
        if(tipo.equals("1")){
            Fabrica1 f = new Fabrica1();
        }else if(tipo.equals("2")){
            Fabrica2 f = new Fabrica2();
        }else{
            System.out.println("Tipo inválido");
        }
    }
}
