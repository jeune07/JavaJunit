

import java.util.ArrayList;
import java.util.List;

public class GroupT {
    private final List<Person> persons= new ArrayList<>();
    public void addPerson(final Person p) throws UnderAgeException, LetrasExeption {
        if(p.age()<18) throw new UnderAgeException();
        if(!letras(p.name())) throw new LetrasExeption();
        persons.add(p);
    }
    private boolean letras(final String name){
        return name.chars().mapToObj(c ->(char) c).filter(Character::isLetter).count()>5;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
