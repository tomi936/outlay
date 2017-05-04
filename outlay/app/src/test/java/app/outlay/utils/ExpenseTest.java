package app.outlay.utils;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import app.outlay.domain.model.Category;
import app.outlay.domain.model.Expense;

import static org.junit.Assert.*;

/**
 * Created by László Tamás on 2017. 05. 04..
 */
public class ExpenseTest {

    private String id = "1";
    private String note = "Test note";
    private BigDecimal amount = BigDecimal.valueOf(10.0);
    private Date reportedWhen = new Date(2017,03,21,13,14,5);
    private Category category;

    private String id2 = "11";
    private String note2 = "Test note2";
    private BigDecimal amount2 = BigDecimal.valueOf(20.0);
    private Date reportedWhen2 = new Date(2017,04,26,8,0,12);
    private Category category2;

    private Expense exp, exp2;

    @Before
    public void setUp() throws Exception {
        category = new Category();
        category.setId("1");
        category.setTitle("Test Category");
        category.setIcon("ic_fuel");
        category.setOrder(1);
        category.setColor(-26624);

        category2 = new Category();
        category2.setId("3");
        category2.setTitle("Test Category2");
        category2.setIcon("ic_bowling");
        category2.setOrder(3);
        category2.setColor(-30624);

        exp = new Expense();
        exp.setId(id);
        exp.setNote(note);
        exp.setAmount(amount);
        exp.setCategory(category);
        exp.setReportedWhen(reportedWhen);


        exp2 = new Expense();
        exp2.setId(id2);
        exp2.setNote(note2);
        exp2.setAmount(amount2);
        exp2.setCategory(category2);
        exp2.setReportedWhen(reportedWhen2);
    }

    @Test
    public void getId() throws Exception {
        boolean result = exp.getId().equals(id);

        assertEquals(true, result);
    }

    @Test
    public void setId() throws Exception {
        exp.setId(id2);
        boolean result = exp.getId().equals(id2);

        assertEquals(true, result);
    }

    @Test
    public void getNote() throws Exception {
        boolean result = exp.getNote().equals(note);

        assertEquals(true, result);
    }

    @Test
    public void setNote() throws Exception {
        exp.setNote(note2);
        boolean result = exp.getNote().equals(note2);

        assertEquals(true, result);
    }

    @Test
    public void getAmount() throws Exception {
        boolean result = exp.getAmount().equals(amount);

        assertEquals(true, result);
    }

    @Test
    public void setAmount() throws Exception {
        exp.setAmount(amount2);
        boolean result = exp.getAmount().equals(amount2);

        assertEquals(true, result);
    }

    @Test
    public void getReportedWhen() throws Exception {
        boolean result = exp.getReportedWhen().equals(reportedWhen);

        assertEquals(true, result);
    }

    @Test
    public void setReportedWhen() throws Exception {
        exp.setReportedWhen(reportedWhen2);
        boolean result = exp.getReportedWhen().equals(reportedWhen2);

        assertEquals(true, result);
    }

    @Test
    public void getCategory() throws Exception {
        boolean result = exp.getCategory().equals(category);

        assertEquals(true, result);
    }

    @Test
    public void setCategory() throws Exception {
        exp.setCategory(category2);
        boolean result = exp.getCategory().equals(category2);

        assertEquals(true, result);
    }


    @Test
    public void equals() throws Exception {
        boolean result = exp.equals(exp2);

        assertEquals(false, result);
    }

    @Test
    public void equals2() throws Exception {
        exp2.setId(id);
        boolean result = exp.equals(exp2);

        assertEquals(true, result);
    }

    @Test
    public void equals3() throws Exception {
        Expense exp3 = exp;
        boolean result = exp.equals(exp3);

        assertEquals(true, result);
    }

    @Test
    public void hashCode0() throws Exception {
        boolean result = exp.hashCode() == exp.getId().hashCode();

        assertEquals(true, result);
    }

    @Test
    public void hashCode1() throws Exception {
        Expense exp3 = new Expense();
        boolean result = exp3.hashCode() == 0;

        assertEquals(true, result);
    }

    @Test
    public void hashCode2() throws Exception {
        boolean result = exp.hashCode() == exp.hashCode();

        assertEquals(true, result);
    }

}