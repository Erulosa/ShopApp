package shopApp;

public class Client {
public static void main(String[] args) {
        Window window = new Window();
        DataBase db = null;
if (SaveLoadData.isDataBaseExists())
            db = SaveLoadData.loadData();
if (db == null)
            db = new DataBase();
        window.loadDataBase(db);
    }
}
