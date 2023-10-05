public class Kaktusar extends  VäxtNamn implements Print{


    private angeVätska vätskeTyp = angeVätska.mineralvatten; //enum

    public Kaktusar(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public void MängdenVätskaUtskrift() {
        double vätskeMängd = 0.2;
        System.out.println("Ge" + " " + namn + " " + vätskeMängd + " liter " + vätskeTyp);

    }
}

