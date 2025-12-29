package java8.FunctionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateJoiningDemo6 {
    public static void main(String[] args) {
        ArrayList<SoftwareEngineer> list = new ArrayList<>();
        list.add(new SoftwareEngineer("Avinash",20,true));
        list.add(new SoftwareEngineer("Ashutosh",34,false));
        list.add(new SoftwareEngineer("Abhishek",27,true));
        list.add(new SoftwareEngineer("Rishabh",19,false));
        list.add(new SoftwareEngineer("Rahul",14,false));
        list.add(new SoftwareEngineer("Noveta",17,true));
        list.add(new SoftwareEngineer("Sumit",40,false));
        list.add(new SoftwareEngineer("Gunjan",50,true));
        list.add(new SoftwareEngineer("Pratik",7,true));
        list.add(new SoftwareEngineer("Gaurav",30,true));

        Predicate<SoftwareEngineer> predicate = softwareEngineer -> softwareEngineer.age > 18 && softwareEngineer.hasGirlFriend;
        for(SoftwareEngineer engineer : list){
            if(predicate.test(engineer))
                System.out.println(engineer);
        }

    }
}
