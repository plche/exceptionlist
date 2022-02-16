import java.util.ArrayList;
/**
 * ExceptionList
 */
public class ExceptionList {

    public void listGenerator() {
        // Declaración e inicialización del arreglo
        ArrayList<Object> myList = new ArrayList<Object>();

        // Agregando items al arreglo
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        // Recorremos la lista
        for (int i = 0; i < myList.size(); i++) {
            Object objValue = myList.get(i);
            try {
                int castedValue = (int) objValue;
            } catch (ClassCastException e) {
                //handliing exception
                System.out.println("\n========Informe de Error========");
                System.out.println("Error: " + e.getLocalizedMessage());
                System.out.println("Índice: " + i);
                System.out.println("Valor del Objeto (activó Error): " + objValue.toString());
            }
        }

        // Termina la app
        System.out.println("\nFin de la App");
    }
}