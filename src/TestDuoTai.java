
public class TestDuoTai {
	
	public static void main(String[] args) {
		TestDuoTai t = new TestDuoTai();
		t.first();
	}
	
	class Value{
	    int i = 15;
	}

	
	public void first() {
		int i = 5;
		Value v1 = new Value();
		v1.i = 25;
		second(v1, i);
		System.out.println(v1.i);//20
	}
	
	public void second(Value v, int i) {//Value v= v1; v.i=25;   i=5
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;

		System.out.print(v.i + "" + i);//15  0
		
	}
	

}
