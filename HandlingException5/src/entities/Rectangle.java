package entities;

import exceptions.RectangleDataException;

public class Rectangle {
  
  private double base;
  private double height;

  public Rectangle(double base, double height) throws RectangleDataException {
    validateData(base, height);
    setBase(base);
    setHeight(height);
  }

  /**
   * Getters / Setters
   * ========================================
   */
  public double getBase() {
    return base;
  }
  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }


  /**
   * Main methods
   * ========================================
   */
  private void validateData(double base, double height) throws RectangleDataException {
    if (base <= 0) {
      throw new RectangleDataException("Base inválida: Insira um valor positivo (maior que 0)");
    }
    if (height <= 0) {
      throw new RectangleDataException("Altura inválida: Insira um valor positivo (maior que 0)");
    }
  }

  public double calcArea() {
    double area = height * base;
    return area;
  }

  public double calcPerimeter() {
    double perimeter = 2 * (base + height);
    return perimeter;
  }

}
