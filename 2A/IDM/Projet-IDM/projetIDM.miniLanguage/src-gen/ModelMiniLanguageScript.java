import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModelMiniLanguageScript {
	
	public static List<Float> getResult(List<Float> colonne1, List<Integer> colonne2, List<Integer> colonne3) {
		int size = colonne1.size();
		
		final Integer a = Integer.valueOf(3);
		ArrayList<Float> b = (ArrayList<Float>) colonne1.stream().map(e -> e + a).collect(Collectors.toList());
		
//		ArrayList<Float> d = new ArrayList<>();
//		for (int i = 0; i < colonne1 .size(); i++) {
//			d.add(colonne1.get(i) + colonne2.get(i));
//		}
		
		ArrayList<Float> d = (ArrayList<Float>) IntStream.range(0, size).mapToObj(i->colonne1 .get(i)+colonne2.get(i)).collect(Collectors.toList());
		
		final Integer q = Integer.valueOf(4);
		
		Integer s = Math.min(a, q);
		
		return b;
	}
	
	
	
}