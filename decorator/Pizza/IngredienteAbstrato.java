public abstract class IngredienteAbstrato implements IPizza{
    IPizza pizza;
    double custo;
    public IngredienteAbstrato(IPizza pizza){
        this.pizza = pizza;
    }
    public double getPreco(){
        return custo + pizza.getPreco();
    }

    /**
     * @return IPizza return the pizza
     */
    public IPizza getPizza() {
        return pizza;
    }

    /**
     * @param pizza the pizza to set
     */
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }

    /**
     * @return double return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

}
