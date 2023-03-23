package firstpackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class test4 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,null);
		Consumer<Integer> t=(data)->{System.out.println(data);};
		list.forEach(t);
		System.out.println("ok");
	}

}
