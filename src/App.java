import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        List<String> listPalavras = new ArrayList<String>();
        List<String> PalavrasIguais = new ArrayList<String>();
        List<Integer> listSize = new ArrayList<Integer>();
        List<Integer> listMaior = new ArrayList<Integer>();

        for (int i = 0; i < a; i++) {
            String anterior = br.readLine();
            list.add(anterior);
        }

        int b = Integer.parseInt(br.readLine());

        for (int i = 0; i < b; i++) {
            String novo = br.readLine();
            listPalavras.add(novo);
        }

        for (int i = 0; i < b; i++) {
            for (int k = 0; k < a; k++) {
                String test = list.get(k);
                String test2 = listPalavras.get(i);
                if (testaString(test, test2) == true) {
                    PalavrasIguais.add(test);
                }
            }
            listSize.add(PalavrasIguais.size());
            listMaior.add(Maior(PalavrasIguais));
            PalavrasIguais.clear();

        }

        for (int i = 0; i < b; i++) {
            if (listSize.get(i) == 0) {
                System.out.println(-1);
            } else {
                System.out.print(listSize.get(i) + " ");
                System.out.println(listMaior.get(i));
            }
        }

    }

    public static Boolean testaString(String a, String b) {
        boolean possui = false;
        int bLength = b.length();
        if (a.length() >= b.length()) {

            String c = a.substring(0, bLength);

            if (c.equals(b)) {
                possui = true;
            }

        }

        return possui;
    }

    public static int Maior(List<String> a) {
        int maiorP = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i == 0) {
                maiorP = a.get(i).length();
            } else if (a.get(i).length() > maiorP) {
                maiorP = a.get(i).length();
            }
        }

        return maiorP;

    }
}
