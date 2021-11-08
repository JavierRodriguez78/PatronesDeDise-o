package com.javierrodriguez;

import com.javierrodriguez.command.OpenTextFileOperation;
import com.javierrodriguez.command.SaveTextFileOperation;
import com.javierrodriguez.command.TextFileOperation;
import com.javierrodriguez.invoker.TextFileOperationExecuter;
import com.javierrodriguez.receiver.TextFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("archivo1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("archivo2.txt"));
        TextFileOperationExecuter textFileOperationExecuter = new TextFileOperationExecuter();
        System.out.println(textFileOperationExecuter.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecuter.executeOperation(saveTextFileOperation));
    }



}
