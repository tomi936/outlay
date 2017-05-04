package app.outlay.utils;

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
    Category cat1;

    @Before
    public void setUp() throws Exception {
        cat1 = new Category();
        cat1.setId(id);
        cat1.setTitle(title);
        cat1.setIcon(icon);
        cat1.setOrder(order);
        cat1.setColor(color);
    }

    @Test
    public void getId() throws Exception {
        boolean result = cat1.getId().equals(id);

        assertEquals(true, result);
    }

    @Test
    public void setId() throws Exception {
        cat1.setId("25");
        boolean result = cat1.getId().equals("25");

        assertEquals(true, result);
    }

    @Test
    public void getTitle() throws Exception {
        boolean result = cat1.getTitle().equals(title);

        assertEquals(true, result);
    }

    @Test
    public void setTitle() throws Exception {
        cat1.setTitle("Testing");
        boolean result = cat1.getTitle().equals("Testing");

        assertEquals(true, result);
    }

    @Test
    public void getIcon() throws Exception {
        boolean result = cat1.getIcon().equals(icon);

        assertEquals(true, result);
    }

    @Test
    public void setIcon() throws Exception {
        cat1.setIcon("ic_bowling");
        boolean result = cat1.getIcon().equals("ic_bowling");

        assertEquals(true, result);
    }

    @Test
    public void getOrder() throws Exception {
        boolean result = cat1.getOrder() == order;

        assertEquals(true, result);
    }

    @Test
    public void setOrder() throws Exception {
        cat1.setOrder(5);
        boolean result = cat1.getOrder() == 5;

        assertEquals(true, result);
    }

    @Test
    public void getColor() throws Exception {
        boolean result = cat1.getColor() == color;

        assertEquals(true, result);
    }

    @Test
    public void setColor() throws Exception {
        cat1.setColor(-30624);
        boolean result = cat1.getColor() == -30624;

        assertEquals(true, result);
    }

}