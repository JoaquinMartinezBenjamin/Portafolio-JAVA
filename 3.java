import javax.swing. *;
public class Main{
public Main(){}
public void imprimirCuenta(){
int n;
int contaN=1;
String imprimir= " ";
n =Integer.parseInt(JOptionPane.showInputDialog("Introduzca el total de numeros a imprimir"));
for(contaN=1;contaN<=n;contaN++) {
imprimir += String.valueOf(contaN)+" ";
}
JOptionPane.showMessageDialog(null,"El resultado es: \n " + imprimir);
}
public static void main (String[]args)
{
Main result= new Main();
result.imprimirCuenta();}
}