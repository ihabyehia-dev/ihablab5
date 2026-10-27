package lab5;

public class main {

	public static void main(String[] args) {

		DoubleLinked d1 = new DoubleLinked();
		DoubleLinked d2 = new DoubleLinked();

		d1.insertatback(10);
		d2.insertatback(20);
		d1.displayforward();
		d2.displayforward();
		d1.insertatkey(5, 10);
		d2.insertatkey(7, 6);
		d1.displayforward();
		d1.displaybackward();
		d1.deleteByvalue(10);
		d1.deletefromback();
		System.out.println(d1.searchrecursive(5) + " is the position of the key");
		System.out.println(d1.isempty());
		d1.insertatfront(9);
		d1.deletefromfront();

	}
}
