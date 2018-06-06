package validasi;

public class ValidAngka {
	int inputanMen;

	public boolean harusAngka(String inputanMenu, boolean doo) {
		if(inputanMenu.matches("-?[0-9]+")) {
			inputanMen = Integer.parseInt(inputanMenu);
			doo = true;
		}
		else {
			doo = false;
		}
		return doo;
	}
}