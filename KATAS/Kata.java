/*Clase Kata:
  Método estático divisibleCount:
    Parámetros:
      x: número entero largo
      y: número entero largo
      k: número entero largo

    Si k es igual a 0:
      Retornar 0

    Si x es igual a 0:
      Retornar y dividido por k más 1

    Retornar y dividido por k menos (x menos 1) dividido por k*/

public class Kata {
  public static long divisibleCount(long x, long y, long k) {
    if(k==0){
      return 0;
    }
    if(x==0){
      return y/k+1;
    }
    return y/k-(x-1)/k;
  }
}

