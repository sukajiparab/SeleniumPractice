import java.util.ArrayList;
import org.testng.annotations.*;

public class streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Sukaji");
		names.add("Abhi");
		names.add("Ak");
		names.add("Mayur");
		names.add("Dada");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count=count+1;
			}
		}
		System.out.println(count);
	}
	@Test
	public void streamFilter(){
		ArrayList<String> names=new ArrayList<String>();
		names.add("Sukaji");
		names.add("Abhi");
		names.add("Ak");
		names.add("Mayur");
		names.add("Dada");
		
		long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}

}
