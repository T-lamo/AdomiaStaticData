package model;

import com.ceri.prototypageadomia.Person;

import java.util.ArrayList;

public final class ListSingleton {

    private Person person;
    private ArrayList<Sejour> listSejour = new ArrayList<Sejour>();
    private ArrayList<Question> listQuestion;
    private ArrayList<Voyage> listVoyage;
    private ArrayList<Voyageur> listVoyageur;
    private ArrayList<DemandeSejour> demandeSejour;


    private final static ListSingleton INSTANCE = new ListSingleton();

    private ListSingleton() {}

    public static ListSingleton getInstance() {
        return INSTANCE;
    }

    public void setPerson(Person u) {
        this.person = u;
    }

    public Person getPerson() {
        return this.person;
    }


    public  ArrayList<Sejour> getSejourList(){

        model.Hote hote;
            Service service;


            for(int i=0; i<10000; i++){
                hote = new model.Hote(i,"prenom"+i, "prenom"+i);
                service = new Service(i,"libelle"+i);

            listSejour.add(new Sejour(i,hote,service,"France"+i,"Avignon"+i, 2));
        }
            return listSejour;
    }


    /*
    Map<String, Integer> files = new HashMap<>();
        files.put("amos", 1212312);
        files.put("jamos", 9846545);
        files.put("amchabie", 2153516);
        files.put("TEST_INVENTORY3651321.zip", 3651321);

        String regex = "^[a-zA-Z]+$";

        List<Map.Entry<String, Integer>> matches = files.entrySet().stream()
                .filter(x -> x.getKey().startsWith("am"))
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        matches.forEach(x -> System.out.println(x.getKey()));
    */


    //Sejour,Voyage, Voyageur, hote,question, reservation
}
