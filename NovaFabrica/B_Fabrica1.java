public class B_Fabrica1 extends B{
    public Coisa produzir(){
        System.out.println("Coisa B fabrica 1");
        return new B_Fabrica1();
    }
}
