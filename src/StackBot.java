import java.util.Random;
import java.util.Stack;

public class StackBot
{
	float x;
	float y;
	public static void main(String[] args){
		StackBot sb = new StackBot();
		sb.findingPosition();
		
	}
	Stack<String> commands = new Stack<String>();
	{
		commands.push("1.15 N");
		commands.push("0.79 S");
		commands.push("0.25 W");
		commands.push("0.15 W");
		commands.push("1.78 S");
		commands.push("0.95 E");
		commands.push("0.75 E");
		commands.push("1.37 N");
		commands.push("0.75 E");
		commands.push("1.85 W");
		commands.push("1.73 W");
		commands.push("0.72 N");
		commands.push("0.75 E");
		commands.push("0.65 E");
		commands.push("1.09 S");
		commands.push("1.75 W");
		commands.push("1.55 N");
		commands.push("0.73 E");
		commands.push("1.05 W");
		commands.push("0.71 E");
		commands.push("1.45 E");
		commands.push("1.75 N");
		commands.push("1.91 S");
		commands.push("0.45 S");
		commands.push("0.11 E");
	}

	public void findingPosition()
	{
		 y = 0;
		 x = 0;
		String holder;
		
		
		while(commands.empty() == false){
			holder = commands.pop();
			String bleh = holder.substring(0, 4);
			float thing = Float.parseFloat(bleh);
		if(holder.indexOf("N") == 5){
			y = y+thing;
		}
		else if(holder.indexOf("S") == 5){
			y = y-thing;
		}
		else if(holder.indexOf("E") == 5){
			x = x+thing;
		}
		else{
			x = x-thing;
		}
		}
System.out.println(x);

System.out.println(y);
	}

}
