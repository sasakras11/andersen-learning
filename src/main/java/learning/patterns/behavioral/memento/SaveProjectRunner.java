package learning.patterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws Exception{
   Project project = new Project();
   GithubRepo githubRepo = new GithubRepo();

        System.out.println("creating new project VERSION 1.0");
        project.setVersionAndDate("version 1.0");

        System.out.println(project);

        System.out.println("saving current versino to github....");
        githubRepo.setSave(project.save());

        System.out.println("updating project to version 1.1");
        System.out.println("writing poor code....");
        Thread.sleep(5000);

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("something went wrong");

        System.out.println("Rolling back to version 1.0");

        project.load(githubRepo.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
