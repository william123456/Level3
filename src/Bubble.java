import java.util.ArrayList;


public class Bubble {
  public static void main(String[] args) {
Bubble bub = new Bubble();

Bubble b1 = new Bubble(), b2 = new Bubble(), b3 = new Bubble();

ArrayList <Bubble> bubbleWrap = new ArrayList <Bubble>();

bubbleWrap.add(b1);

bubbleWrap.add(b2);

bubbleWrap.add(b3);

for(int i = 0; i<bubbleWrap.size(); i++){
	Bubble b = bubbleWrap.get(i);
	
	b.pop();
}
}
	
	public void pop(){
	   System.out.println("pop");
	}

}
