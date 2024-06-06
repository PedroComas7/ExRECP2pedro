package exRECP2pedro;
import java.util.Scanner;
public class FuncionsSegonGra {
public static void main(String[] args) {
Scanner coeficient = new Scanner (System.in);
int valorA , valorB, valorC;
System.out.println("Procederem a la resolució d'una equació de segon gra. Considereix els coeficients següents:");
System.out.println("ax^2+bx+c=0 ");
System.out.println("Ingres el coeficient a: ");
valorA = coeficient.nextInt();
System.out.println("Ingres el coeficient b: ");
valorB = coeficient.nextInt();
System.out.println("Ingres el coeficient c: ");
valorC = coeficient.nextInt();

System.out.println(
("Ecuació: "+valorA+"x^2+"+valorB+"x+"+valorC+"=0").replace("+-", "-").replace("1x", "x")

);
System.out.println("Solucions:");
double resultados[] = ecuacion2Grado(valorA, valorB, valorC);
if (resultados == null) {
System.out.println("No tiene solucion");
} else {
for (int i = 0; i < resultados.length; i++) {
System.out.println(resultados[i]);
}
}
}
public static double[] ecuacion2Grado(int a, int b, int c) {
double discriminante = (Math.pow(b, 2) - (4 * a * c));
if (discriminante >= 0) {
double soluciones[];
// Una solucion
if(discriminante == 0){
soluciones = new double[1];
soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
// Dos soluciones
}else{
soluciones = new double[2];
soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) /
(2 * a);
soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) /
(2 * a);
}
return soluciones;
} else {
// Sin solucion
return null;
}
}
}
