package com.javierrodriguez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FileWriteCaretaker caretaker = new FileWriteCaretaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("Primera escritura \n");
        System.out.println(fileWriter+"\n\n");

        caretaker.save(fileWriter);
        fileWriter.write("Segunda escritura \n");
        System.out.println(fileWriter+"\n\n");
        caretaker.undo(fileWriter);
        System.out.println(fileWriter+"\n\n");

    }
}
