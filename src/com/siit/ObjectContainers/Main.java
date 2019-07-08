package com.siit.ObjectContainers;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Main {

    public static void main(String ags[]) {


        Persoana p1 = new Student("maria", 23, "2564839204683");
        Persoana p2 = new Student("ana", 30, "2564839000683");
        Persoana p3 = new Angajat("irina", 32, "3424632764432");

        List<Persoana> listaPersoane = new ArrayList<Persoana>();
        listaPersoane.add(p1);
        listaPersoane.add(p2);
        listaPersoane.add(p3);
        for (int i = 0; i < listaPersoane.size(); i++) {
            System.out.println(listaPersoane.get(i).getName());}


         /*   List<Persoana> listaPersoaneNoua = new LinkedList<Persoana>();
            listaPersoane.add(p1);
            listaPersoane.add(p2);
            listaPersoane.add(p3);

            for (int j = 0; i < listaPersoaneNoua.size(); j++) {
                System.out.println(listaPersoaneNoua.get(j).getName());
            }

        /*Persoana[] persona=new Persoana[4];

        persona[0]=p1;
        persona[1]=p2;
        persona[2]=p3;

        for (int i=0; i<persona.length; i++){
            System.out.println(persona[i].getName());
       }

                */

        LinkedHashSet <Persoana> listaPersoanaHashSet= new LinkedHashSet<Persoana>();
        listaPersoanaHashSet.add(p1);
        listaPersoanaHashSet.add(p2);
        listaPersoanaHashSet.add(p3);


        /*for(Persoana person:listaPersoanaHashSet){
            if (p1.equals(p2)){
            System.out.println(person.getName());}
        }
                */

            // la equals trebuie sa fie de acelasi fel dupa egal declarate
        if (p1.equals(p2)){
            System.out.println("cnp identic");
        }

        if (p1.equals(p3)){
            System.out.println("cnp diferit");
        }

       // System.out.println();

        Map<String,Persoana> myPeople= new HashMap<>();
        myPeople.put("student1",p1);
        myPeople.put("student2", p2);
        myPeople.put("angajat1", p3);


       // System.out.println(myPeople.get("student1"));
//          ne arata doar valoarea
        for(String key: myPeople.keySet()){
           // System.out.println(myPeople.get(key));
        }

// ne arata si cheia

        for(Persoana person:myPeople.values()){
           // System.out.println(person);
        }
        for(Map.Entry<String, Persoana> entry :myPeople.entrySet())
        {
           // System.out.println(entry);
        }


        TreeSet<Persoana> listPersoaneTreeSet= new TreeSet<>();
        listPersoaneTreeSet.add(p1);
        listPersoaneTreeSet.add(p2);
        listPersoaneTreeSet.add(p3);

        System.out.println(listPersoaneTreeSet);

        Collections.sort(listaPersoane, new Comparator<Persoana>() {
            @Override
            public int compare(Persoana p1, Persoana p2){
                return p1.getCnp().compareTo(p2.getCnp());
            }
        });

        System.out.println("after sort:");
        System.out.println(listaPersoane);
    }




}