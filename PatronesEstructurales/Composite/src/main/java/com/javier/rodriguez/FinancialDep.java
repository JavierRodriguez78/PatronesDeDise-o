package com.javier.rodriguez;

public class FinancialDep implements Department{

    private Integer id;
    private String name;


    public FinancialDep(Integer Id, String name){
        this.id=id;
        this.name= name;
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
