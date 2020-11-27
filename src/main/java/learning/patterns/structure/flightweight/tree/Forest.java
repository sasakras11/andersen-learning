package learning.patterns.structure.flightweight.tree;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();



    public void plantTree(int x, int y,String name, Color color, String otherTreeData){
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
    }

    @Override
    public void paint(Graphics graphics) {
        for(Tree tree : trees){
            tree.draw(graphics);
        }
    }
}
