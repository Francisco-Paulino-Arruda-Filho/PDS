public class D_Fabrica2 extends D{
    public Coisa produzir(){
        System.out.println("Coisa D fabrica 2");
        return new D_Fabrica2();
    }
}
