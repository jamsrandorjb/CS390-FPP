package lab6;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	//returns the value in the instance vble of Bottom
	int readBottom() {
		//implement
		return t;
	}
	class Middle {
		int m = 2;
		//returns sum of instance vble in Top and
		//instance vble in Bottom
		int addTopAndBottom() {
			//implement
			return m+readBottom();
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement
				return b+addTopAndBottom();
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();
		Top.Middle mid = top.new Middle();
		Top.Middle.Bottom bottom = mid.new Bottom();

		System.out.println(top.readBottom());
		System.out.println(mid.addTopAndBottom());
		System.out.println(bottom.multiplyAllThree());

	}

}