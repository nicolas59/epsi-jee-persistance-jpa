package fr.epsi.tp.persistance.jpa.demo.entity;

public class Marque {

  private Long id;
  
  private String libelle;
  
  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

}
