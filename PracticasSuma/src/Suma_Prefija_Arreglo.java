public class Suma_Prefija_Arreglo {
    public static void main(String[] args) {

        int x= Integer.parseInt(args[0]);//declarar x y darle el valor de la primera posicion del arreglo args[]
        int n= args.length-1;//declarar n para darle tamaño al arreglo
        int A[]=new int[n];//declarar arreglo
        boolean ok=false;//booleana para saber si existe esa suma

        for (int i = 0; i <n; i++) {//inicio bucle for
            A[i]=Integer.parseInt(args[i+1]);//pasar los argumentos del arreglo args[] al arreglo A[] como enteros
        }//end for

        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j < n; j++) {
                if (A[i] + A[j] == x) {//if para saber si al sumar da el valor de x
                    ok = true;//le damos el valor de true a la booleana
                }//end if
            }
        }//end for anidado
            if (ok) {//comprobamos que valor tiene la booleana
                System.out.println("Si");
            }
            else {
                System.out.println("No");
        }
    }//end main
}//end class