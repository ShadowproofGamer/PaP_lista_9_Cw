//metoda 1
class Pojazd(val producent: String, val model: String, val rok: Int = -1, var rejestracja: String = "") {
  def this(producent: String, model: String, rejestracja: String) = {
    this(producent, model, -1, rejestracja)
  }

}


new Pojazd("Fiat", "126p", 2016, "ESI123")
new Pojazd("Fiat", "126p", 2016)
new Pojazd("Fiat", "126p", "ESI123")
new Pojazd("Fiat", "126p")

//metoda2

class Pojazd2(val producer: String, val model: String, val productionYear: Int = -1, var registrationNumber: String = "")

//4 konstruktory:
var p1 = new Pojazd2("vw", "golf 1")
var p2 = new Pojazd2("vw", "golf 1", 1990)
var p3 = new Pojazd2("vw", "golf 1", 1990, "HFP")
var p4 = new Pojazd2("vw", "golf 1", registrationNumber = "HFP") // argument nazwany (podawany jako ostatni)