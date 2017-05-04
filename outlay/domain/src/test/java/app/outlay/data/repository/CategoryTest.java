package app.outlay.data.repository;

import org.junit.Before;
import org.junit.Test;

import app.outlay.domain.model.Category;

import static org.junit.Assert.*;

/**
 * Created by László Tamás on 2017. 05. 04..
 */
public class CategoryTest {
    String id = "1";
    String title = "Test title";
    String icon = "ic_fuel";
    int order = 3;
    int color = -26624;

    String id2 = "25";
    String title2 = "Testing";
    String icon2 = "ic_bowling";
    int order2 = 5;
    int color2 = -30624;
    Category cat1,cat2;

    @Before
    public void setUp() throws Exception {
        cat1 = new Category();
        cat1.setId(id);
        cat1.setTitle(title);
        cat1.setIcon(icon);
        cat1.setOrder(order);
        cat1.setColor(color);


        cat2 = new Category();
        cat2.setId(id2);
        cat2.setTitle(title2);
        cat2.setIcon(icon2);
        cat2.setOrder(order2);
        cat2.setColor(color2);
    }

    @Test
    public void getId() throws Exception {
        boolean result = cat1.getId().equals(id);

        assertEquals(true, result);
    }

    @Test
    public void setId() throws Exception {
        cat1.setId(id2);
        boolean result = cat1.getId().equals(id2);

        assertEquals(true, result);
    }

    @Test
    public void getTitle() throws Exception {
        boolean result = cat1.getTitle().equals(title);

        assertEquals(true, result);
    }

    @Test
    public void setTitle() throws Exception {
        cat1.setTitle(title2);
        boolean result = cat1.getTitle().equals(title2);

        assertEquals(true, result);
    }

    @Test
    public void getIcon() throws Exception {
        boolean result = cat1.getIcon().equals(icon);

        assertEquals(true, result);
    }

    @Test
    public void setIcon() throws Exception {
        cat1.setIcon(icon2);
        boolean result = cat1.getIcon().equals(icon2);

        assertEquals(true, result);
    }

    @Test
    public void getOrder() throws Exception {
        boolean result = cat1.getOrder() == order;

        assertEquals(true, result);
    }

    @Test
    public void setOrder() throws Exception {
        cat1.setOrder(order2);
        boolean result = cat1.getOrder() == order2;

        assertEquals(true, result);
    }

    @Test
    public void getColor() throws Exception {
        boolean result = cat1.getColor() == color;

        assertEquals(true, result);
    }

    @Test
    public void setColor() throws Exception {
        cat1.setColor(color2);
        boolean result = cat1.getColor() == color2;

        assertEquals(true, result);
    }

    @Test
    public void equals() throws Exception {
        boolean result = cat1.equals(cat2);

        assertEquals(false, result);
    }

    @Test
    public void equals2() throws Exception {
        cat2.setId(id);
        boolean result = cat1.equals(cat2);

        assertEquals(true, result);
    }

    @Test
    public void equals3() throws Exception {
        Category cat3 = cat1;
        boolean result = cat1.equals(cat3);

        assertEquals(true, result);
    }

    @Test
    public void hashCode0() throws Exception {
        boolean result = cat1.hashCode() == cat1.getId().hashCode();

        assertEquals(true, result);
    }

    @Test
    public void hashCode1() throws Exception {
        Category cat3 = new Category();
        boolean result = cat3.hashCode() == 0;

        assertEquals(true, result);
    }

    @Test
    public void hashCode2() throws Exception {
        boolean result = cat1.hashCode() == cat1.hashCode();

        assertEquals(true, result);
    }

}