package rp.javap.pros.dp.f_abstractFactory.v3_extend;

public class Client {

	public static void main(String[] args) {
		ComputerEngineer engineer = new ComputerEngineer();
		AbstractFactory schema = new Scheme3();
		engineer.makeComputer(schema);
	}
}
