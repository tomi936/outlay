package app.outlay.data.repository;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import app.outlay.domain.model.Expense;

import static org.junit.Assert.*;

/**
 * Created by László Tamás on 2017. 05. 04..
 */
public class ReportTest {

    private List<Expense> expenses;
    private Date startDate = new Date(2016,01,22,14,6,45);
    private Date endDate = new Date(2017,03,12,10,30,25);

    @Before
    public void setUp() throws Exception {
        expenses = new ArrayList<Expense>();
    }
    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void getExpenses() throws Exception {

    }

    @Test
    public void setExpenses() throws Exception {

    }

    @Test
    public void getStartDate() throws Exception {

    }

    @Test
    public void setStartDate() throws Exception {

    }

    @Test
    public void getEndDate() throws Exception {

    }

    @Test
    public void setEndDate() throws Exception {

    }

    @Test
    public void getTotalAmount() throws Exception {

    }

    @Test
    public void getTotalAmount1() throws Exception {

    }

    @Test
    public void groupByCategory() throws Exception {

    }

}