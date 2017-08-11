
public class test {
	public static void main(String[] args) {
		HaiTaoList list = new HaiTaoList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.remove(1);
		
		list.set(3,"aaaa");
		
		for (int i = 0; i < list.size; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.size);
	}
}
