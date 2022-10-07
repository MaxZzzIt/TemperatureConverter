package by.home.maxzzzit;

//Перевод температуры из Цельсия в Фаренгейт и обратно (если аргумент convertTo равен F то температура должна быть
// переведена в Фарингейт и наоборот соответственно)
public class TemperatureConverter {
	public static void main(String[]args) {

		convertTemp(72,'C');
	}
	
	public static String convertTemp(int temperature, char convertTo) {
		double preobraz=0;
		String s = null;
		if (convertTo=='C') {
			preobraz=((double)5/9)*(temperature-32);
			System.out.println(Math.round(preobraz)+" по Цельсию");
			s=String.valueOf(preobraz);
			}
		else if
			(convertTo=='F') {
			preobraz=(double)9/5*temperature+32;
			System.out.println(Math.round(preobraz)+" по Фаренгейту");
			s=String.valueOf(preobraz);
			}
		else
			System.out.println("Введите корректное число");

		return s;
	}
}
