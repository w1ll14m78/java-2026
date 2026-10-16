package privado;

public class Celular {
    private String marca;
    private String modelo;
    private int ano;


    public Celular(String marca,String modelo,int ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public String getMarca() {
        if (this.marca == null) {
            return "Redmi ";
        }
        return this.marca;
    }

    public String getModelo() {
        if (this.modelo == null) {
            return "14C ";
        }
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setAno(int ano) {this.ano = ano;}
}
