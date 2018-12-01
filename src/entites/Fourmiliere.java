package entites;

import java.util.ArrayList;
import java.util.List;

public class Fourmiliere {

  /**
   * Liste des fourmis qui seront presente dans la formiliere.
   */
  private List<Fourmi> fourmis;

  /**
   * Constructeur de la fourmiliere.
   */
  public Fourmiliere() {
    fourmis = new ArrayList<>();
  }

  /**
   * Methode qui permet d'ajouter une fourmi à la fourmiliere.
   * 
   * @param fourmi
   *          la fourmi à ajouter
   */
  public void ajouterFourmi(Fourmi fourmi) {
    fourmis.add(fourmi);
  }
}
