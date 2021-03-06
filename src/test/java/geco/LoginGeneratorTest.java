package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Kini on 21/11/2016.
 */
public class LoginGeneratorTest {

    private LoginGenerator aLoginGenerator;

    @Before
    public void setUp() throws Exception {
        String[] start = new String[]{"JROL","BPER","COUR", "JDUP", "JRAL", "JRAL1"};
        aLoginGenerator = new LoginGenerator(new LoginService(start));

    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        Assert.assertEquals("PDUR",login);
    }

    @Test
    public void generateLoginForJRAL2() throws Exception {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        Assert.assertEquals("JRAL2", login);

    }

    @Test
    public void loginPDUR2() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        Assert.assertEquals("PDUR", login);
    }

    @Test
    public void loginJROLNumber() {
        int i;
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Roling", "Jean");
        Assert.assertEquals("JROL1", login);
    }

}