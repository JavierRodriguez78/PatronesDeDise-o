package com.javier.rodriguez;

public class SalesDep implements Department{

    private Integer id;
    private String name;

    public SalesDep(Integer id, String name) {
        this.id = id;
        this.name = name;
    }




    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
