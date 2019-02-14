import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class week4Assignment {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Ted");
		employeeNames.add("Bob");
		employeeNames.add("Cam");
		employeeNames.add("Sedd");
		employeeNames.add("Tiffany");
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(0);
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		Set<Integer> employeeKeys = employeeMap.keySet();
		for (Integer key : employeeKeys) {
			System.out.println(key + " " + employeeNames.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		for (String employee : employeeNames){
			namesBuilder.append(employee + " ");
		}System.out.println(namesBuilder.toString());

	}

}
