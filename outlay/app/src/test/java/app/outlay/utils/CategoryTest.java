package app.outlay.utils;

import org.junit.Before;
import org.junit.Test;

import app.outlay.domain.model.Category;

import static org.junit.Assert.*;

/**
 * Created by user on 2017. 05. 04..
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

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void setId() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {

    }

    @Test
    public void setTitle() throws Exception {

    }

    @Test
    public void getIcon() throws Exception {

    }

    @Test
    public void setIcon() throws Exception {

    }

    @Test
    public void getOrder() throws Exception {

    }

    @Test
    public void setOrder() throws Exception {

    }

    @Test
    public void getColor() throws Exception {

    }

    @Test
    public void setColor() throws Exception {

    }

}