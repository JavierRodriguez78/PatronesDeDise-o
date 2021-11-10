package com.javierrodriguez;

public class FileWriteCaretaker {
    private Object obj;
    public void save(FileWriterUtil fileWriter){
        this.obj = fileWriter.save();
    }
    public void undo(FileWriterUtil fileWriterUtil){
        fileWriterUtil.undoToLastSave(obj);
    }
}
