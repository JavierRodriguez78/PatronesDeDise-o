package com.javierrodriguez.invoker;

import com.javierrodriguez.command.TextFileOperation;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecuter {

    private final List<TextFileOperation> textFileOperationList = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation){
        textFileOperationList.add(textFileOperation);
        return textFileOperation.execute();
    }
}
