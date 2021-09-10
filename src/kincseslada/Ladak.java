package kincseslada;
public class Ladak {
    String[] ladaF = {"\nAranyláda", "Ezüstláda", "Bronzláda"};
    String[] ladaSz = {"Bennem van az X!", "Bennem nincs kincs..", "Az aranyláda hazudik! >:("};
    void ladaValasz(){
        for (int i = 0; i < ladaF.length; i++) {
            System.out.println(ladaF[i] + ": " + ladaSz[i]);
        }
    }
}
