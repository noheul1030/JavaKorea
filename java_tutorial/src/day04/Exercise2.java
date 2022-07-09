package day04;

public class Exercise2 {
	public static void main(String[] args) {
		new Exercise2().execute();
	}

	void execute() {
		case01();
	}

	void case01() {
		boolean isSuccess = true;
		boolean isNumber = false;

		int idx = 0;
		while( (-100 < idx) && (idx < 100)) {
			if( isSuccess && 100 > idx++) {
				System.out.println("idx1 = " + idx);
			} else {
				System.out.println("idx2 = " + idx--);
			}
		}

		if( isSuccess || isNumber) {

		}
	}
}
