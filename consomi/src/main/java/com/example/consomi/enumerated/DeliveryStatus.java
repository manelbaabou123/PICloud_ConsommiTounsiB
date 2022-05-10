package com.example.consomi.enumerated;


public enum DeliveryStatus {
 enAttente("enAttente"),
 enCours("enCours"),
 done("done");

 private final String etat;
 DeliveryStatus(String etat){
  this.etat=etat;
 }

 public String getEtat() {
  return this.etat;
 }
}
