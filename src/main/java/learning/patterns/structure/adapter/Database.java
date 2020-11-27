package learning.patterns.structure.adapter;

public interface Database {

    public void save();
    public void update();
    public void get();
    public void delete();
}
