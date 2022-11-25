import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    @DisplayName("WHEN a person object is created THEN has the right params")

    public void test1(){
        //GIVEN
        var name= "jeu";
        var age= 29;

        //WHEN
        var person=new Person(name,age);
        // THEN
        assertEquals(person.name(),name);
        assertEquals(person.age(),age);


    }
}
