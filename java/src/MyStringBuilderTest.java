public class MyStringBuilderTest {
	public static void main(String[] args) {
		MyStringBuilder sb = new MyStringBuilder();
		sb.append("hello,");
		sb.append(" ");
		sb.append("world!");
		System.out.println("\"" + sb.toString() + "\"");
	}	
}