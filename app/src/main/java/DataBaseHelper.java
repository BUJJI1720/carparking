import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="User.db";
    public static final String TABLE_NAME="user_table";
    public static final String COL_1="Name";
    public static final String COL_2="Carnumber";
    public static final String COL_3="Time";
    public static final String COL_4="phone";

    public DataBaseHelper(Context context) {
        super(context,DATABASE_NAME ,null,1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ TABLE_NAME + "(phone INTEGER PRIMARY KEY,Name TEXT,Carnumber VARCHAR PRIMARY KEY,Time INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
