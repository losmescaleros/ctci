import java.util.ArrayList;

public class MyStringBuilder {
	private final int DEFAULT_LENGTH = 10;
	private char[] buff;
	private int index;

	public MyStringBuilder() {
		buff = new char[DEFAULT_LENGTH];
		index = 0;
	}

	public String toString() {
		buff[index] = '\0';
		return new String(buff);
	}

	public MyStringBuilder append(String str) {
		char[] chars = str.toCharArray();
		int newLength = index + chars.length + 1;
		if(newLength > buff.length) {
			buff = copy(buff, new char[newLength * 2]);
		}

		str.getChars(0, chars.length, buff, index);
		index = newLength;
		return this;
	}

	private char[] copy(char[] arr1, char[] arr2) {
		if(arr2.length > arr1.length) {
			for(int i = 0; i < arr1.length; i++) {
				arr2[i] = arr1[i];
			}
		}
		
		return arr2;
	}
}