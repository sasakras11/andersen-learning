package learning.patterns.structure.decorator.data.impl;

public class SplitDataTransferDecorator extends DataTransferDecorator{


    private final String spaceReplacement;
    public SplitDataTransferDecorator(DataTransfer transfer,String spaceReplacement) {
        super(transfer);
        this.spaceReplacement = spaceReplacement;
    }

    @Override
    public String readData() {
        return addSplit(super.readData());
    }

    @Override
    public void putData(String data) {
        super.putData(removeSplit(spaceReplacement));
    }

    private String addSplit(String data){
      return data.replaceAll(" ",spaceReplacement);

    }
    private String removeSplit(String data){
      return data.replaceAll(spaceReplacement," ");
    }
}
