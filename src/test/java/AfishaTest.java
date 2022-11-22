import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void testFindAll() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] actual = afisha.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] actual = afisha.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoreLimit() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");

        String[] actual = afisha.moreLimit();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEqualLimit() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] actual = afisha.equalLimit();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
