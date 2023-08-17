public class Suma_Prefija {
    public static void main(String[] args) {

        int arr1[] = new int[args.length];//creando array
        int suma = 0;//variable para sumar

        for (int i = 0; i < arr1.length; i++) {//for para recorrer el array

            try {

                arr1[i] = Integer.parseInt(args[i]);//convirtiendo el valor en entero y asignandolo al argumento
                suma += arr1[i];//sumando el valor
                System.out.println(arr1[i] + ","+ suma);//imprimiendo el valor actual y la suma
            }catch (NumberFormatException e){
                System.out.println("El numero que ingreso en la posicion "+(i+1)+" no es valido "+args[i]);
            }
        }//Fin for
    }//Fin main
}
