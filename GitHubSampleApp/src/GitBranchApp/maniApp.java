package GitBranchApp;

public class maniApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st Version");
		//�o�O�@�ӥ[�k�B��
		Math cMath = new Math();
		System.out.println(cMath.add(10, 5));
		System.out.println("again");
		System.out.println("merge");
	}

}

class Math{
	int add(int a,int b) {
		return a+b;
	}
}