public class C_Fabrica2 extends C{
    public Coisa produzir(){
        System.out.println("Coisa C fabrica 2");
        return new C_Fabrica2();
    }
}
