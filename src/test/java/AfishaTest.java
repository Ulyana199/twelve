import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void testFindAll() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");

        String[] actual = afisha.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3","Movie 4", "Movie 5"};

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
    public void test1Movies() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        String[] expected = {"Movie 1"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testNoMovies() {
        Afisha afisha = new Afisha();

        afisha.add("");

        String[] actual = afisha.findAll();
        String[] expected = {""};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void withinRange() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showMoviesReversOrder() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void show9Movies() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");

        String[] expected = {"Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWithinMaxRange() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");
        afisha.add("Movie 11");
        afisha.add("Movie 12");

        String[] expected = {"Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWithinMinRange() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void newLimit() {
        Afisha afisha = new Afisha(7);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
