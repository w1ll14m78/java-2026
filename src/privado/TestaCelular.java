package privado;

public class TestaCelular {
    public static void main(String[] args) {
        Celular phone  = new Celular( "Redmi Xiome", "14C", 2023);

        /*phone.setMarca("Redmi Xiomi");
        phone.setModelo("14C");
        phone.setAno(2023);*/

        System.out.println("marca: " + phone.getMarca());
        System.out.println("modelo: " + phone.getModelo());
        System.out.println("ano: " + phone.getAno());
    }

}
