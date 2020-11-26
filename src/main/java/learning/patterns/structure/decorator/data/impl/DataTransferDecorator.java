package learning.patterns.structure.decorator.data.impl;

import learning.patterns.structure.decorator.data.TransferAble;

public class DataTransferDecorator implements TransferAble {

    private final TransferAble transferAble;

    public DataTransferDecorator(TransferAble transferAble) {
        this.transferAble = transferAble;
    }

    @Override
    public String readData() {
        return transferAble.readData();
    }

    @Override
    public void putData(String data) {
         transferAble.putData(data);
    }

}
