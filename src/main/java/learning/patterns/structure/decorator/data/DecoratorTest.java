package learning.patterns.structure.decorator.data;


import learning.patterns.structure.decorator.data.impl.CaseDataTransferDecorator;
import learning.patterns.structure.decorator.data.impl.DataTransfer;
import learning.patterns.structure.decorator.data.impl.DataTransferDecorator;

public class DecoratorTest {
    public static void main(String[] args) {

        DataTransferDecorator changed = new CaseDataTransferDecorator(new DataTransfer("dadada a qq qw "));

        System.out.println(changed.readData());
    }
}
