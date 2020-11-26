package learning.patterns.structure.decorator.data.impl;

import learning.patterns.structure.decorator.data.TransferAble;

public class DataTransfer implements TransferAble {

    private String data;

    public DataTransfer(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }

    @Override
    public void putData(String data) {
          this.data = data;
    }

    public String getData() {
        return data;
    }
}
