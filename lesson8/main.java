package working;

public class main {
	public static void main(String[] args) {
		Weather sky = new Weather();
		Forecast tree = new Forecast.Fake();
		sky.Give_Temp();
		tree.Give_Temp_Fake();
	}
}

interface Forecast
{
	void Give_Temp_Fake();

	final class Fake implements Forecast
	{
		public void Give_Temp_Fake()
		{
			System.out.println("2");
		}
	}
}

class Weather implements Forecast
{
	private int Temp;
	public
	void Give_Temp()
	{
		Temp = 2;
		System.out.println(Temp);
	}
}