package agri.com.roompracticeapplication.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;
import agri.com.roompracticeapplication.model.Employee;

/**
 * Created by akash.sharma on 5/24/2018.
 */
@Dao
public interface DaoAccess {

    @Insert
    void insertMultipleRecord(Employee... emloyees);

    @Insert
    void insertMultipleListRecord(List<Employee> employees);

    @Insert
    void insertOnlySingleRecord(Employee employee);

    @Query("SELECT * FROM Employee")
    List<Employee> fetchAllData();

    @Query("SELECT * from Employee where id = :empId")
    Employee fetchEmployeebyId(int empId);

    @Update
    void updateRecord(Employee employee);

    @Delete
    void deleteRecord(Employee employee);

}
