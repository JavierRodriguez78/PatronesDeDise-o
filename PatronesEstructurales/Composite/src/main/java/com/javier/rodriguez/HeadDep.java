package com.javier.rodriguez;

import java.util.ArrayList;
import java.util.List;

public class HeadDep implements Department{
    private Integer id;
    private String name;
    private List<Department> childDepartments;



    public HeadDep(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<Department>();
    }

    @Override
    public void printDepartmentName() {
        this.childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartMent(Department dep)
    {
        this.childDepartments.add(dep);
    }


    public void removeDepartment(Department dep)
    {
        this.childDepartments.remove(dep);
    }
}
