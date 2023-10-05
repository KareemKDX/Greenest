public class KöttätandeVäxter extends VäxtNamn implements Print{

    private angeVätska vätskeTyp = angeVätska.proteindryck; //enum

    public KöttätandeVäxter(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public void MängdenVätskaUtskrift() {
        double vätskeMängd =  0.1 + (0.2 * höjd);

        System.out.println("Ge" + " " + namn + " " + vätskeMängd + " liter " + vätskeTyp);


    }
}
