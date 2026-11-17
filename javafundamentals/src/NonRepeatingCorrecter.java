import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCorrecter {
    public static void main(String[] args) {

        String str = "Hello";

//        Map<Character, Integer> map = new LinkedHashMap<>();
//        for (char ch : str.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
        Character   nonRepeat =  str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(nonRepeat);
    }
}
