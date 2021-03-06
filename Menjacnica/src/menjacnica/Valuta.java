package menjacnica;

import java.util.LinkedList;

public class Valuta {
private String naziv;
private String skraceniNaziv;
private static LinkedList<Kurs> kursevi = new LinkedList<Kurs>();

public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	if(naziv == null || naziv.isEmpty() == true) throw new RuntimeException("Nije uneta odgovarajuca vrednost.");
	this.naziv = naziv;
}
public String getSkraceniNaziv() {
	return skraceniNaziv;
}
public void setSkraceniNaziv(String skraceniNaziv) {
	if(naziv == null || naziv.isEmpty() == true) throw new RuntimeException("Nije uneta odgovarajuca vrednost.");
	this.skraceniNaziv = skraceniNaziv;
}
public static LinkedList<Kurs> getKursevi() {
	return kursevi;
}

public static void setKursevi(LinkedList<Kurs> kursevi) {
	if(kursevi.isEmpty() == true || kursevi == null) throw new RuntimeException("Nije uneta odgovarajuca vrednost.");
	Valuta.kursevi = kursevi;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
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
	Valuta other = (Valuta) obj;
	if (naziv == null) {
		if (other.naziv != null)
			return false;
	} else if (!naziv.equals(other.naziv))
		return false;
	return true;
}
@Override
public String toString() {
	return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kursevi:" + kursevi + "]";
}




}

