package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
private double kupovni;
private double srednji;
private double prodajni;
private GregorianCalendar datumKursa;
public double getKupovni() {
	return kupovni;
}
public void setKupovni(double kupovni) {
	if(kupovni <= 0) throw new RuntimeException("Nije uneta odgovarajuca vrednost.");
	this.kupovni = kupovni;
}
public double getSrednji() {
	return srednji;
}
public void setSrednji(double srednji) {
	if(srednji <= 0) throw new RuntimeException("Nije uneta odgovarajuca vrednost.");
	this.srednji = srednji;
}
public double getProdajni() {
	return prodajni;
}
public void setProdajni(double prodajni) {
	if(prodajni <= 0) throw new RuntimeException("Nije uneta odgovarajuca vrednost.");
	this.prodajni = prodajni;
}
public GregorianCalendar getDatumKursa() {
	return datumKursa;
}
public void setDatumKursa(GregorianCalendar datumKursa) {
	if(datumKursa == null) throw new RuntimeException("Nije uneta odgovarajuca vrednost.");
	this.datumKursa = datumKursa;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(kupovni);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(prodajni);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Kurs other = (Kurs) obj;
	if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
		return false;
	if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
		return false;
	return true;
}
@Override
public String toString() {
	return "Kurs [kupovni =" + kupovni + ", srednji =" + srednji + ", prodajni =" + prodajni + ", datumKursa:" + datumKursa.getTime()
			+ "]";
}


}


