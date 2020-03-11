package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReading {
	
public static void main(String[] args) {
	
	String fileName = "‪C://Users/User/Desktop/CV1.docx";
	try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

		stream.forEach(System.out::println);

	} catch (IOException e) {
		e.printStackTrace();
	}

}
}
