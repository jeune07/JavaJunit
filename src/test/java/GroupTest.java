import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroupTest {

    @Test
    @DisplayName("WHEN we try to add a person less than 18 it throws an exception")
    public void test2(){
        // GIVEN
        var person=new Person("Winsley",50);
        var groupT=new GroupT();
        // WHEN

        var exc = assertThrows(LetrasExeption.class, ()->groupT.addPerson(person));
        //Then

        assertEquals(exc.getMessage(),"Deberia tener mas de 18");
    }

    @Test
    @DisplayName("WHEN we try to add a person plus than 18")
    public void test3() throws LetrasExeption, UnderAgeException {
        // GIVEN
        var person=new Person("Winsley",50);
        var groupT=new GroupT();
        // WHEN

     groupT.addPerson(person);
        //Then

        assertTrue(groupT.getPersons().contains(person));
    }


}
