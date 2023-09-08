package TestMap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final Map<String, String> dict;

    public Dictionary() throws IOException {
        dict = new HashMap<>();
        loadData();
    }

    private void loadData() throws IOException {
        File f = new File("C:\\Users\\kinhc\\Documents\\LearnJava\\Study\\src\\LabMatrix\\dictionary.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            String[] words = line.split("-");
            String eng = words[0].trim();
            String vi = words[1].trim();
            dict.put(eng, vi);
        }

        br.close();
        fr.close();
    }

    private void saveData() throws IOException {
        File f = new File("Dictionary.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        for (Map.Entry<String, String> entry : dict.entrySet()) {
            bw.write(entry.getKey() + " - " + entry.getValue() + " \n");
        }

        bw.close();
        fw.close();

    }

    public void addWord() throws IOException {
        System.out.println("--------ADD--------");
        String eng = Validation.getString("Enter English : ");
        if (dict.containsKey(eng) && !Validation.getYN(eng + "is already exist, do you want to update (Y/N) ? ")) {
            return;
        }

        String vi = Validation.getString("Enter Vietnamese : ");
        dict.put(eng, vi);
        saveData();
        System.out.println("Add Success");

    }

    public void removeWord() throws IOException {
        System.out.println("--------DELETE--------");
        String eng = Validation.getString("Enter English : ");
        if (!dict.containsKey(eng)) {
            System.out.println("Not Found");
            return;
        }
        dict.remove(eng);
        saveData();
        System.out.println("Delete Success");
    }

    public void translate() {
        System.out.println("--------TRANSLATE--------");
        String eng = Validation.getString("Enter English : ");
        if (!dict.containsKey(eng)) {
            System.out.println("Not Found!!");
            return;
        }

        System.out.println("Vietnamese : " + dict.get(eng));
    }
}
