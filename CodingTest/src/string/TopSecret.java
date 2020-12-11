/* baekjoon11365
 * 당신은 길을 가다가 이상한 쪽지를 발견했다.
 * 그 쪽지에는 암호가 적혀 있었는데, 똑똑한 당신은 암호가 뒤집으면 해독된다는 것을 발견했다.
 * 이 암호를 해독하는 프로그램을 작성하시오.
 * 
 * input
 * 한 줄에 하나의 암호가 주어진다.
 * 암호의 길이는 500을 넘지 않는다.
 * 마지막 줄에는 "END"가 주어진다.
 * (END는 해독하지 않는다.)
 * 
 * output
 * 각 암호가 해독된 것을 한 줄에 하나씩 출력한다.
 * 
 * example
 * !edoc doog a tahW
 * noitacitsufbo
 * erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW
 * lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC
 * END
 * -> 
 * What a good code!
 * obfustication
 * We intend to begin on the first of February unrestricted submarine warfare
 * Concealed within his fortress, the lord of Mordor sees all
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TopSecret {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String line = br.readLine();
			
			if(line.equals("END"))
				break;
			
			for(int i=0; i<line.length(); i++) 
				System.out.print(line.charAt(line.length()-1-i));
			System.out.println();
		}
	}
}