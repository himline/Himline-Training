package Grossarystore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesUtil {
	public static String readTextFile(String fileName) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		return content;
	}
}
