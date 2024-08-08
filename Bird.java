package tracing_exercise;

public class Bird  {
	   public static void main(String args[]) {
	     System.out.println("zero");
	     Bird s = new SillyBird(1);
	     Bird s2 = new Loony();
	     s.poit(s2);
	     s2.poit(s);
	     System.out.println("zymurgy");
	   }

	   public Bird() {
	     this(0);
	     System.out.println("zircon");
	   }
	   public Bird(int i) {  System.out.println("zanzibar");   }
	   public void narf() {   System.out.println("zort");   } 
	   public void poit(Bird s) {  s.narf();   }
	}

	class SillyBird extends Bird {
	   public SillyBird(){
		   //super();		//non effective! is automatically called when accessed.
	      System.out.println("duchess");
	   }
	   public SillyBird(int i) {
	      super(i);
	   }
	   public void narf() {
	      System.out.println("drum");
	      super.narf();
	   }
	}

	class Loony extends SillyBird {
	   public Loony() {
		   //super();		//non effective! is automatically called when accessed.
	     System.out.println("stupendous");
	   }
	   public void narf() {
	     System.out.println("snark");
	   }
	}
