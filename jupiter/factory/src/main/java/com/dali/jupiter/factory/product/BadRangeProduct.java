package com.dali.jupiter.factory;

public class BadRangeProduct extends ProductImpl {

  Caracteristics Carac = new Caracteristics();

  public String[] getProductInformations() {
    Carac.setCaracteristics("QUINZER", "REF-XX-333", "blue", 3, 30);
    System.out.println("Printing Product informations :"
        + "\n\tName : " + Carac.getName()
        + "\n\tReference : " + Carac.getReference()
        + "\n\tColor : " + Carac.getColor()
        + "\n\tRange : " + Carac.getRange()
        + "\n\tPrice : " + Carac.getPrice()
        + "\n------------------------------\n");
    return new String[] {Carac.getName(), Carac.getReference(), Carac.getColor(), Integer.toString(Carac.getPrice())};
  }
}
