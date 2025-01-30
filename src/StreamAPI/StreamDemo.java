package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo 
{

	public static void main(String[] args) 
	{
//		// 1st method
//		List<Integer> numberList=Arrays.asList(12,23,11,19,55,16,27,32);
//		Stream<Integer> nStream=numberList.stream();
//		nStream.forEach((e)->System.out.println(e));
//
//		//2nd method
//		IntStream numberStream=IntStream.of(12,23,11,19,55,16,27,32);
//		numberStream.forEach((e)->System.out.println(e));
//		
//		//3rd method
//		Stream.Builder<String> streamBuilder=Stream.builder();
//		streamBuilder.add("Router");
//		streamBuilder.add("switch");
//		streamBuilder.add("cables");
//		streamBuilder.add("BTS");
//		streamBuilder.add("BSC");
//		
//		Stream stream=streamBuilder.build();
//		stream.forEach((e)->System.out.println(e));
		
		List<String> nameList=Arrays.asList("Peter","Sam","Erric","Mathew","Bo","Li","Dan");
		Stream<String> nameStream=nameList.stream();
		//nameStream.filter((e)->e.length()>=3).forEach((e)->System.out.println(e));
		nameStream.map((e)->e.toUpperCase()).forEach((e)->System.out.println(e));
		
//		nameStream.filter((e)->e.length()>=3);
//		map((e)->e.toUpperCase());
//		forEach((e)->System.out.println(e));
	}
}