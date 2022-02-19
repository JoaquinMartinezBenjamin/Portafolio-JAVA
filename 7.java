import javax.swing. *;
public class Main{
public Main(){}
public void evaluarN(){
int n,num;
int contaN=1;
String imprimir= " ";
n =Integer.parseInt(JOptionPane.showInputDialog("Introduzca el total de numeros a evaluar"));
do{
num= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero" +contaN+ " a evaluar"));
if (num % 2==0){
imprimir += String.valueOf(num)+" es par\n";
}
else {
imprimir += String.valueOf(num)+" es impar \n";
}
contaN++;
}
while (contaN<=n);
JOptionPane.showMessageDialog(null,"El resultado es: \n " + imprimir);
}
public static void main (String[]args)
{
Main result= new Main ();
result.evaluarN();}
}