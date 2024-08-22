package atvd14;

public enum UF {
    BA("Bahia"),
    SP("São Paulo"),
    RJ("Rio de Janeiro");

    String texto;

    private UF(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
