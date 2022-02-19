import javax.swing. *;
public class Main {
public Main(){}
public void cuentaPares() {
int conta=2;
int contaP=0;
int n= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número para calcular los pares"));
while(conta <=n) {
contaP=contaP+1;
conta=conta +2;
}
JOptionPane.showMessageDialog(null, "El número de pares es: "+ contaP);
}
public static void main (String[]args)
{
Main result= new Main();
result.cuentaPares();}
}