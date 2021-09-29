package com.javier.rodriguez;

public interface AbstractFactory<T>{
    T create(String type);
}
