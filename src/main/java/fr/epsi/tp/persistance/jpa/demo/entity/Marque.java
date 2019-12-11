package fr.epsi.tp.persistance.jpa.demo.entity;

import java.util.List;

public class Marque {

  private Long id;
  
  private String libelle;
  
  private List<Produit> produits;

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

  public List<Produit> getProduits() {
    return produits;
  }

  public void setProduits(List<Produit> produits) {
    this.produits = produits;
  }

}
