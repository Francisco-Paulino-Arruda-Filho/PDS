public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MassaBordaRecheada pizza = new MassaBordaRecheada();
        Ovo pizzaComOvo = new Ovo(pizza);
        Presunto pizzaComOvoPresunto = new Presunto(pizzaComOvo);
        MolhoTomate pizzaComOvoPresuntoMolhoTomate = new MolhoTomate(pizzaComOvoPresunto);
        System.out.println(pizzaComOvoPresuntoMolhoTomate.getPreco());
    }
}
