package Week3.Day1;

public class Automation extends MultipleLanguage implements Language,TestTool {
	
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
	}
	public void java() {
		System.out.println("TestLeaf Java");
	}
	public void selenium() {
		System.out.println("TestLeaf Selenium");
	}
	
	public void ruby() {
		System.out.println("TestLeaf Ruby");
	}
}
