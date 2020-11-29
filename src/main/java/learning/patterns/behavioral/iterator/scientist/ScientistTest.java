package learning.patterns.behavioral.iterator.scientist;

public class ScientistTest {
    public static void main(String[] args) {

        String[] scientistSkills = new String[]{"read","learn","critic","work hard"};

        SpaceScientist spaceScientist = new SpaceScientist(scientistSkills,"Alexander");
        Iterator iterator = spaceScientist.getIterator();


        System.out.println("scientist "+ spaceScientist.getName()+" have skills :");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
