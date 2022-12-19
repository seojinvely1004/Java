package chap10;

import java.text.DecimalFormat;

public class FormatTest {
	public static void main(String[] args) {
		double d = 3.14 * 10;
		System.out.println(d);
		//# - 1자리 10진수. 0표시X
		//0 - 1자리 10진수. 0표시O
		//DecimalFormat df = new DecimalFormat("##.#");31.4//정수2자리 소수점1까지 >0이면표시를안해준다.
		//DecimalFormat df = new DecimalFormat("##.##");//31.4(0생략됨)
		//DecimalFormat df = new DecimalFormat("##.00");//31.40소수점2째짜리까지보여주고 0이면 0도 보여줘
		DecimalFormat df = new DecimalFormat("000.00");//031.40정수3자리,소숫점2자리보여줘.정수3자리가안되면 0으로라도 채워줘.
		String dStr = df.format(d);
		System.out.println(dStr);
	}
}
