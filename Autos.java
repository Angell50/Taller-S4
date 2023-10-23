public class Autos {
    private String marca;
    private String modelo;
    private String color;
    private Double cilindraje ;

    public Autos(String modelo, String color, String marca){
           this.cilindraje = cilindraje;
           this.modelo = modelo;
           this.color = color;
           this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Double getCilindraje() {
        return cilindraje;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindraje(Double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String detalleAuto(){
        //String color = "Verde";
        /*System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);*/

        String da = "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Cilindraje: " + this.cilindraje;
        return da;

    }

    public String acelerar(int rpm){

        return "El auto " + this.marca + " esta acelerando a " + rpm + " rpm.";
    }

    public String frenar(int rpm){
        return "El auto "+this.marca+" de color "+this.color+", modelo "+this.modelo+", con "+rpm+" rpm, esta frenando.";
    }

    public float combustible(float km, float gl){
        return km/gl;
    }

    public float combustible(int km, int gl){
        return km/gl;
    }
}



