package fr.epsi.tp.persistance.jpa.demo.entity;

public class CommandeLigne {

  private Produit produit;
  
  private int quantite;

  public Produit getProduit() {
    return produit;
  }

  public void setProduit(Produit produit) {
    this.produit = produit;
  }

  public int getQuantite() {
    return quantite;
  }

  public void setQuantite(int quantite) {
    this.quantite = quantite;
  }
  
  
}
