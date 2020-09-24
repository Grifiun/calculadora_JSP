/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author grifiun
 */
public class RealizarOperacion {
    /**
     * Dentro de esta funcion realizamos las operaciones de los numeros que nos manden
     * @param n1
     * @param n2
     * @param operacion
     * @return 
     */
    public String calcular(int n1, int n2, String operacion){
        int aux;
        String respuesta = "";
        switch(operacion){
            case "suma":
                aux = n1 + n2;
                respuesta = "la suma de los dos numeros es "+aux;
                break;
            case "resta":
                aux = n1 - n2;
                respuesta = "la resta de los dos numeros es "+aux;
                break;
            case "mayor":
                if(n1 > n2)
                   respuesta = "el mayor de los dos numeros es el num 1: "+n1;
                else if(n1 == n2)
                   respuesta = "ambos numeros son iguales, R: "+n1;
                else
                   respuesta = "el mayor de los dos numeros es el num 2: "+n2;
                break;
            case "potencia":
                //calculamos la potencia, math pow funciona como pow(base, n)
                aux = (int)Math.pow(n1,n2);
                respuesta = "n1 elevado a n2 es igual a "+aux;               
                break;
            case "binario":
                String bin1 =  Long.toBinaryString(n1);
                String bin2 =  Long.toBinaryString(n2);
                respuesta = "El binario del numero "+n1+" es "+bin1+"\n"
                        +"Y el binario del numero "+n2+" es "+bin2;
                break;
            default:      
        }       
        return respuesta;//retornamos la respuesta como String
    }
}
