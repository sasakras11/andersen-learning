package learning.patterns.behavioral.iterator.scientist;

public class SpaceScientist implements Collection{
    private String[] skills;
    private String name;
    private int arrayPosition = 0;


    public SpaceScientist(String[] skills, String name) {
        this.skills = skills;
        this.name = name;
    }


    @Override
    public Iterator getIterator() {
        return new SpaceScientistIterator();
    }

    public String[] getSkills() {
        return skills;
    }

    public String getName() {
        return name;
    }

    class SpaceScientistIterator implements Iterator{

        @Override
        public boolean hasNext() {
            return arrayPosition < skills.length;
        }

        @Override
        public Object next() {
            return skills[arrayPosition++];
        }
    }

}
