package BuilderFactory;

public class Builder {
    public Veiculo produzVeiculo(String tipo, String chassi){
        if(tipo.equals("Moto")){
            return new Moto(chassi);
        }else if(tipo.equals("Carro")){
            return new Carro(chassi);
        }else{
            return new Caminhao(chassi);
        }
    }
}
