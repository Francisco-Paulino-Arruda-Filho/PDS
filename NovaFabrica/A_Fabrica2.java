public class A_Fabrica2 extends A{
    public Coisa produzir(){
        System.out.println("Coisa A fabrica 2");
        return new A_Fabrica2();
    }
}
