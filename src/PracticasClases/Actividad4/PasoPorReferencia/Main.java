package PracticasClases.Actividad4.PasoPorReferencia;

public class Main {

    public static void ChangeBox(Box newBox){
    newBox.size = 20;
    }

    public static void main(String[] args) {
        Box caja1 = new Box(50);
        System.out.println(caja1.size);

        ChangeBox(caja1);
        System.out.println(caja1.size);
    }
}
