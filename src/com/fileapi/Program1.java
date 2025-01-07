package com.fileapi;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) throws IOException {
        String inputFile= "src//com//fileapi//input.txt";
        String outputFile="src//com//fileapi//output.txt";
        BufferedReader bufferedReader=new BufferedReader(new FileReader(inputFile));
         String line;
         List<Person> personList=new ArrayList<>();
         while ((line=bufferedReader.readLine())!=null){
             String[] arr=line.split(",");
             Person person=new Person();
             person.setName(arr[0]);
             person.setAge(Integer.parseInt(arr[1]));
             person.setEmail(arr[2]);
             personList.add(person);
         }
         bufferedReader.close();
         List<Person> filteredList=personList.stream().filter(p->p.getAge()>30).toList();

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
            for (Person person : filteredList) {
                writer.write(person.toString());
                writer.newLine();  // Move to the next line in the file
            }
        }
        System.out.println("Successfully written to output file");
    }
}
