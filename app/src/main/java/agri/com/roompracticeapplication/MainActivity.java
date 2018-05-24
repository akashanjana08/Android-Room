package agri.com.roompracticeapplication;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import agri.com.roompracticeapplication.dao.Department;
import agri.com.roompracticeapplication.database.SampleDatabase;
import agri.com.roompracticeapplication.model.Employee;

public class MainActivity extends AppCompatActivity {

    SampleDatabase sampleDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleDatabase = SampleDatabase.getDatabase(this);

        Employee emp1 = new Employee();
        emp1.setName("Akash");
        Employee emp2 = new Employee();
        emp2.setName("Alok");
        Employee emp3 = new Employee();
        emp3.setName("varun");
        Employee emp4 = new Employee();
        emp4.setName("Deepak");



        new AsyncTask<Void,Void,Void>(){

            @Override
            protected Void doInBackground(Void... voids) {

                Department dep1 = new Department();
                dep1.setId(101);
                dep1.setDepName("Computer Science");

                Employee emp1 = new Employee();
                emp1.setName("Akash");
                emp1.setDepartment(dep1);
                Employee emp2 = new Employee();
                emp2.setName("Alok");
                emp2.setDepartment(dep1);
                Employee emp3 = new Employee();
                emp3.setName("varun");
                emp3.setDepartment(dep1);
                Employee emp4 = new Employee();
                emp4.setName("Deepak");
                emp4.setDepartment(dep1);
                //sampleDatabase.daoAccess().insertOnlySingleRecord(emp1);
                sampleDatabase.daoAccess().insertMultipleRecord(emp1,emp2,emp3,emp4);

               /* Employee emp = new Employee();
                emp.setId(5);
                emp.setName("Mayuri");
                sampleDatabase.daoAccess().updateRecord(emp);*/


                List<Employee>  emplaoeList= sampleDatabase.daoAccess().fetchAllData();


                //Employee empData = sampleDatabase.daoAccess().fetchEmployeebyId(5);

                String data = "lkdhskahs";

                return null;
            }
        }.execute();
    }
}
