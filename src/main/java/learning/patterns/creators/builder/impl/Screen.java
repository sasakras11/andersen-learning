package learning.patterns.creators.builder.impl;

public class Screen {
    private MATRIX_TYPE matrixType;
    private int diagonal;

    public Screen(MATRIX_TYPE matrixType, int diagonal) {
        this.matrixType = matrixType;
        this.diagonal = diagonal;
    }

    public MATRIX_TYPE getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(MATRIX_TYPE matrixType) {
        this.matrixType = matrixType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "matrixType=" + matrixType +
                ", diagonal=" + diagonal +
                '}';
    }
}
