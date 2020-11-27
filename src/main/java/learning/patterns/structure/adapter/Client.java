package learning.patterns.structure.adapter;

public class Client {
    public static void main(String[] args) {


        final JavaDbAdapter javaDbAdapter = new JavaDbAdapter();
        javaDbAdapter.findObj();


    }
}
