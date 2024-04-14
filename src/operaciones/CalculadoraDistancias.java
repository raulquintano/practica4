package operaciones;

public class CalculadoraDistancias {        
        

    public static int CalculadoraDistancia(String s1, String s2, int m, int n)
    {
        
        int matriz[][] = new int[m + 1][n + 1];

         /**
          * Comienza a recorrer la matriz
          */
         for (int i = 0; i <= m; i++) 
         {
            for (int j = 0; j <= n; j++) 
            {
                /**
                 * Si el primer String está vacio, la única opción es insertar todos los 
                 * caracteres del segundo string
                 */
                if (i == 0)
                {
                    matriz[i][j] = j; 
                }
                    

                /**
                 * Si el sgundo String esta vacío, la única opción es eliminar
                 * todos los caracteres del primer string
                 */
                else if (j == 0)
                    matriz[i][j] = i;

                /**
                 * Si los últimos caracteres son iguales, no realiza ninguna operación hasta
                 * que encuentre dos que sean distintos
                 */
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    matriz[i][j] = matriz[i - 1][j - 1];

                /**
                 * Si el último caracter es distinto, considera las distintas posibilidades (borrar, insertar o reemplazar)
                 */
                else
                {
                    int borrar = matriz[i - 1][j] + 1;
                    int insertar = matriz[i][j - 1] + 1;
                    int reemplazar = matriz[i - 1][j - 1] + 2;

                    /** 
                     * Entregará el valor mínimo entre las tres distintas operaciones
                     */
                    matriz[i][j] = Math.min(borrar, Math.min(insertar, reemplazar));
                }
                

            }
        }

        return matriz[m][n];

    }
}