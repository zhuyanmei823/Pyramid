/**
*@program:Pyramid
*@Description:
*@author:cherry
*@date:2019.9.20
*/

public class Pyramid{
	
	public static void main(String[] args){
		int i = 8;
		for(int j = 1; j <= i;j++){
			//控制星号数量
			int times = (2*j)-1;
			//控制空格数量
			int times = 0;
			//做出以上规律的限定
			while(time != (i-j))
			{
				System.out.print(" ");
				time++;
			}
			while(time != 0){
				System.out.print("*");
				time--;
			}
			System.out.print("\n");
		}
	}
}