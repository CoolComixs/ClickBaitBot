
import java.util.Random;

public class ClickBait {

	public static void main(String args[]) {

		String per1 = "Obama";
		String per2 = "Donald Trump";
		String per3 = "Bernie Sanders";
		String per4 = "Hillary Clinton";
		String per5 = "Madonna";
		String per6 = "Tim Cook";
		String per7 = "Sergey Brin";
		String per8 = "Larry Page";
		String per9 = "Edward Snowden";

		String act1 = " wants to sue ";
		String act2 = " is going to talk to ";
		String act3 = " is mad at ";
		String act4 = " is angry at ";
		String act5 = " wants to hire ";

		String p1 = null;
		String p2 = null;
		String action = null;

		Random rand = new Random();
		int pe1 = rand.nextInt(9);
		int pe2 = rand.nextInt(9);
		int act = rand.nextInt(5);

		switch (pe1) {
		case 0:
			p1 = per1;
			break;
		case 1:
			p1 = per2;
			break;
		case 2:
			p1 = per3;
			break;
		case 3:
			p1 = per4;
			break;
		case 4:
			p1 = per5;
			break;
		case 5:
			p1 = per6;
			break;
		case 6:
			p1 = per7;
			break;
		case 7:
			p1 = per8;
			break;
		case 8:
			p1 = per9;
			break;
		}

		System.out.println(p1);

		switch (pe2) {
		case 0:
			p2 = per1;
			break;
		case 1:
			p2 = per2;
			break;
		case 2:
			p2 = per3;
			break;
		case 3:
			p2 = per4;
			break;
		case 4:
			p2 = per5;
			break;
		case 5:
			p2 = per6;
			break;
		case 6:
			p2 = per7;
			break;
		case 7:
			p2 = per8;
			break;
		case 8:
			p2 = per9;
			break;
		}
		System.out.println(p2);

		switch (act) {
		case 0:
			action = act1;
			break;
		case 1:
			action = act2;
			break;
		case 2:
			action = act3;
			break;
		case 3:
			action = act4;
			break;
		case 4:
			action = act5;
			break;
		}

		System.out.println(action);
		System.out.println(p1 + action + p2 + "!");
	}

}
