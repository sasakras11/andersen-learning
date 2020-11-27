package learning.patterns.structure.adapter;

public class JavaDbAdapter extends JavaApplication implements Database{
    @Override
    public void save() {
        saveObj();
    }

    @Override
    public void update() {
updateObj();
    }

    @Override
    public void get() {
         findObj();
    }

    @Override
    public void delete() {
  deleteObj();
    }
}
