package com.sdet.classes;

public class Cake {

    private String cakeFlavour;
    private String icingFlavour;
    private String shape;
    private int pieces;

    public Cake(String cakeFlavour, String icingFlavour, String shape, int pieces) {
        this.cakeFlavour = cakeFlavour;
        this.icingFlavour = icingFlavour;
        this.shape = shape;
        this.pieces = pieces;
    }

    public Cake() {
    }

    public String getCakeFlavour() {
        return cakeFlavour;
    }

    public void setCakeFlavour(String cakeFlavour) {
        this.cakeFlavour = cakeFlavour;
    }

    public String getIcingFlavour() {
        return icingFlavour;
    }

    public void setIcingFlavour(String icingFlavour) {
        this.icingFlavour = icingFlavour;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "cakeFlavour='" + cakeFlavour + '\'' +
                ", icingFlavour='" + icingFlavour + '\'' +
                ", shape='" + shape + '\'' +
                ", pieces=" + pieces +
                '}';
    }
}
