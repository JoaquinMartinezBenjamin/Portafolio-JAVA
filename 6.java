import javax.swing. *;
public class Main {
public Main(){}
public void cuentaPares() {
int conta;
int contaP=0;
int n= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número para calcular los pares"));
for(conta=2;conta<=n;conta=conta+2) {
contaP=contaP+1;
}
JOptionPane.showMessageDialog(null, "El número de pares es: "+ contaP);
}
public static void main (String[]args)
{
Main result= new Main();
result.cuentaPares();}
}