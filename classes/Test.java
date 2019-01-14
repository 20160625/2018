import com.sun.tools.javac.main.Main;

public class Test {

	public static void main(String[] args) {
		Main compiler = new Main("javac");
		compiler.compile(new String[] { "d:/test/Test01.java" });
	}
}
