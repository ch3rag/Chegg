package edu.cscc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

public class UniqueWords {
    public static SortedSet<String> processDocument(File myfile) {
		SortedSet<String> sortedSet = new TreeSet<String>();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myfile))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] tokens = tokenize(line);
				for (String token : tokens) {
					sortedSet.add(token);
				}
			}
		} catch (FileNotFoundException ex) {
			System.err.println(ex.getMessage());
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
		return sortedSet;
    }

    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]"," ");
        String[] tokens = str.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = tokens[i].toLowerCase();
		}
		return tokens;
	}
}