package agri.com.roompracticeapplication.dao;

import android.arch.persistence.room.Entity;

/**
 * Created by akash.sharma on 5/24/2018.
 */
public class Department{

    int id;
    String depName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}