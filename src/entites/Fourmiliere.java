package entites;

import java.util.ArrayList;
import java.util.List;

public class Fourmiliere {

  /**
   * Liste des fourmis qui seront presente dans la formiliere.
   * Hello
   */
  private List<Fourmi> listFourmi;

  /**
   * Constructeur de la fourmiliere.
   */
  public Fourmiliere() {
    this.listFourmi = new ArrayList<>();
  }

  /**
   * Methode qui permet d'ajouter une fourmi à la fourmiliere.
   * 
   * @param fourmi
   *          la fourmi à ajouter
   */
  public void ajouterFourmi(Fourmi fourmi) {
    this.listFourmi.add(fourmi);
  }
}
