public class C_Fabrica1 extends C{
    public Coisa produzir(){
        System.out.println("Coisa C fabrica 1");
        return new C_Fabrica1();
    }
}
