package mockitoTest;

public class Caculator {
	public Caculator(CalculatorService service) {

	}
	public int add(int i,int j) {
		return(i+j)*i;
	}
}
