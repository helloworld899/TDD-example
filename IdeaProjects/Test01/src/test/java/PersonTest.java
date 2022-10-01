import junit.framework.TestCase; //testcase behövs ej i Java, bara C#
import org.junit.Assert;
import org.junit.Test;


public class PersonTest {

    @Test  //en testmetod för att kolla att input via firstName och lastName är rätt. Detta kollas via expectedFullName.
    public void Person_Fullname_Test() {


        //Arrange
        String firstName = "Adam";
        String lastName = "Eriksson";
        String expectedFullName = "Adam Eriksson";

        //Act
        Person personInfo = new Person();
        String actualName = personInfo.fullName(firstName, lastName);

        //Assert
        Assert.assertEquals(expectedFullName, actualName);
    }


    @Test  //en annan testmetod för att kolla att det är enbart versaler i ett namn.
    public void ConvertTo_UpperName_Test() {

        //Arrange
        String firstName = "Adam";
        String lastName = "Eriksson";
        String expectedFullName = "ADAM ERIKSSON";

        //Act
        Person personInfo = new Person();
        String actualName = personInfo.ConvertToUpper(firstName, lastName);

        //Assert
        Assert.assertEquals(expectedFullName, actualName);
    }
}



