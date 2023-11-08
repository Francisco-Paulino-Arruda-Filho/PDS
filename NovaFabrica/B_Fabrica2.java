public class B_Fabrica2 extends B{
    public Coisa produzir(){
        System.out.println("Coisa B fabrica 2");
        return new B_Fabrica2();
    }
}
