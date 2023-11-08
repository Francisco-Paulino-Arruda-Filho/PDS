public class A_Fabrica1 extends A{
    public Coisa produzir(){
        System.out.println("Coisa A fabrica 1");
        return new A_Fabrica1();
    }
}
