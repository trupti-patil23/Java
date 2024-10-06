package StringDemo;

public class SBDEmo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Capacity "+sb1.capacity());
		System.out.println("Length "+sb1.length());
		
		StringBuffer sb = new StringBuffer("Trupti");
		System.out.println("Capacity "+sb.capacity());
		System.out.println("Length "+sb.length());
		System.out.println(sb.reverse());
		
		sb.append(123455);
		sb.append(89.45);
		sb.append(false);
		sb.append('k');
		System.out.println(sb);
	}

}
