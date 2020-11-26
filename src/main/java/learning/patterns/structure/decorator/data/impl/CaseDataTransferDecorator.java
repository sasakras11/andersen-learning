package learning.patterns.structure.decorator.data.impl;


import learning.patterns.structure.decorator.data.TransferAble;

public class CaseDataTransferDecorator extends DataTransferDecorator {


    public CaseDataTransferDecorator(TransferAble dataSource) {
        super(dataSource);
    }

    @Override
    public String readData() {
        return makeAllLowCase(super.readData());
    }

    @Override
    public void putData(String data) {
     super.putData(makeAllUpper(data));
    }

    private String makeAllLowCase(String data){
        return data.toLowerCase();
    }

    private  String makeAllUpper(String data){
        return data.toUpperCase();
    }
}
