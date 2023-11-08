public class D_Fabrica1 extends D{
    public Coisa produzir(){
        System.out.println("Coisa D fabrica 1");
        return new D_Fabrica1();
    }
}
