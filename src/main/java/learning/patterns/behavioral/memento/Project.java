package learning.patterns.behavioral.memento;

import java.util.Date;

public class Project {

    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "version='" + version  +
                ", \ndate=" + date + "\n";
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }
}
