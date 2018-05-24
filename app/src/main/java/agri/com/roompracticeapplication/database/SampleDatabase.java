package agri.com.roompracticeapplication.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import agri.com.roompracticeapplication.dao.DaoAccess;
import agri.com.roompracticeapplication.model.Employee;

/**
 * Created by akash.sharma on 5/24/2018.
 */
@Database(entities = Employee.class , version = 1)
public abstract class SampleDatabase extends RoomDatabase{
    private static SampleDatabase sampleDatabase;
    public abstract DaoAccess daoAccess();

    public static SampleDatabase getDatabase(Context context)
    {
        if(sampleDatabase==null)
        {
            sampleDatabase = Room.databaseBuilder(context , SampleDatabase.class ,"RoomDatabase").build();
        }
        return sampleDatabase;
    }
}
