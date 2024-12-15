package GarbageCollectionDemo;

public class GCDemo {
	int objId;

	public GCDemo(int i) {
		this.objId = i;
		System.out.println("GCDemo Object created for id :=" + i);
	}

	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			new GCDemo(i);
		}
		for (int j = 0; j < 50; j++) {
			System.gc();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("GCDemo Object finalized for id :=" + objId);
	}

}
