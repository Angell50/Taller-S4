public class EjemploAutos {
    public static void main(String[] args) {

                Autos chevrolet = new Autos("chevrolet","vitara","rojo");
                chevrolet.setCilindraje(2.0);

                Autos toyota = new Autos("toyota","Fortuner","negro");
                toyota.setCilindraje(4.5);

                Autos jetour = new Autos("Jetour","x","Vino");
                jetour.setCilindraje(3.6);

                toyota.setModelo("Rava");
                System.out.println(toyota.getModelo());

                System.out.println("------CHEVROLET-----");

                System.out.println("Marca: " + chevrolet.getMarca());
                System.out.println("Modelo: " + chevrolet.getModelo());
                System.out.println("Color: " + chevrolet.getColor());
                System.out.println("Cilindraje: " + chevrolet.getCilindraje());

                System.out.println("---------------------------");

                System.out.println(chevrolet.detalleAuto());
                System.out.println(chevrolet.acelerar(3500));
                System.out.println(chevrolet.frenar(350));
                System.out.println("---------------------------");

                System.out.println("------TOYOTA-----");

                System.out.println("Marca: " + toyota.getMarca());
                System.out.println("Modelo: " + toyota.getModelo());
                System.out.println("Color: " + toyota.getColor());
                System.out.println("Cilindraje: " + toyota.getCilindraje());

                System.out.println("---------------------------");

                System.out.println(toyota.detalleAuto());
                System.out.println(toyota.acelerar(3500));
                System.out.println(toyota.frenar(350));

        System.out.println("La cantidad de combustible de "+toyota.getMarca()+" es: "+toyota.combustible( 15.6f, (float) 20.1f)+" km/gl");
        System.out.println("La cantidad de combustible de "+toyota.getMarca()+" es: "+toyota.combustible( 60, 15)+" km/gl");

        }
}