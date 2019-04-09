package librarylists;

import java.util.Comparator;




public class member implements Comparable<member> {

    public int memberID;
    public String memberForename;
    public String memberSurname;
    public byte memberAge;

    public member(int ID, String forename, String surname, byte age){
        memberID = ID;
        memberForename = forename;
        this.memberSurname = surname;
        this.memberAge = age;
    }

    @Override
    public int compareTo(member o) {

        String name = o.memberForename;
        return this.memberForename.compareTo(name);
    }
}
