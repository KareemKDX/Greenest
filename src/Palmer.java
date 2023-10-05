public class Palmer extends VäxtNamn implements Print {

    private angeVätska vätskeTyp = angeVätska.vatten; //enum

    public Palmer(String namn, int höjd) {

        super(namn, höjd);
    }

    @Override
    public void MängdenVätskaUtskrift() {
        double vätskeMängd = 0.5 * höjd;
        System.out.println("Ge" + " " + namn + " " + vätskeMängd + " liter " + vätskeTyp);
    }


}

