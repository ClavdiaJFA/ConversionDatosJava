
public class ConversionDatosJava {

	public static void main (String[]args) {
		//TODO Auto-generated method stub

/* Tipos de datos en Java
*Númericos: byte, short, int, long, float, double
*Booleanos (verdadero, falso): boolean
*Caracteres: char
*Cadenas: String
*/
/*
 * byte almacen de: -128, a 127
 * int almacen -231 a 231
 */
		
/* byte 8 bits 
 * short 16 bits
 * int 32 bits
 *long 64 bits
 */
byte numeropequeno = 122;
byte otronumeropequeno = 122;
int suma = numeropequeno + otronumeropequeno; 

long numero1 = 1000;
int numero2 = (int) numero1;
float numero3 = numero2;

System.out.println(numero1);
System.out.println(numero2);
System.out.println(numero3);
System.out.println(suma);

}

}