package learning.patterns.behavioral.observer.email_log_notifier;


import java.io.File;

/**
 * conrecte publisher - updates of which subscribers want to check
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor(){
        this.events = new EventManager("open","save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open",file);
    }

    public void saveFile() throws Exception{
        if(this.file!=null){
            events.notify("save",file);
        }
        else throw new Exception("Please open a file first");

    }
}
