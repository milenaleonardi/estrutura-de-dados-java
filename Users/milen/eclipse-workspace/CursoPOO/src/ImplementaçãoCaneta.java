
public class ImplementaçãoCaneta {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic Cristal";
		c1.cor = "azul";
//		c1.ponta = 0.5;
		c1.carga = 80; //esta dentro da classe utilizando a classe Caneta, entao permite utilizar atributo protegido
//		c1.tampada = true;
		c1.destampar();//metodo publico permite alterar atributo privado
		c1.status();
		
		c1.rabiscar();
		
	}
}
