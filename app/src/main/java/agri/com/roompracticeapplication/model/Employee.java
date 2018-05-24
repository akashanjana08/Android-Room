package agri.com.roompracticeapplication.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import agri.com.roompracticeapplication.dao.Department;

/**
 * Created by akash.sharma on 5/24/2018.
 */

@Entity
public class Employee {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    @Embedded(prefix = "dep")
    private  Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



}


