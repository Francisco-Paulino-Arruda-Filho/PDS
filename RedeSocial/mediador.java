public class mediador {
    private redeSocial RedeSocial;
    private String texto;
    public mediador(redeSocial RedeSocial, String texto){
        this.RedeSocial = RedeSocial;
        this.texto = texto;
    }
    

    /**
     * @return redeSocial return the RedeSocial
     */
    public redeSocial getRedeSocial() {
        return RedeSocial;
    }

    /**
     * @param RedeSocial the RedeSocial to set
     */
    public void setRedeSocial(redeSocial RedeSocial) {
        this.RedeSocial = RedeSocial;
    }

    /**
     * @return String return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

}