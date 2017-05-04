package app.outlay.data.repository;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import app.outlay.domain.model.Category;
import app.outlay.domain.model.Expense;
import app.outlay.domain.model.Report;

import static org.junit.Assert.*;

/**
 * Created by László Tamás on 2017. 05. 04..
 */
public class ReportTest {

    private List<Expense> expenses;
    private Expense expense1 = new Expense();
    private Expense expense2 = new Expense();
    private Date startDate = new Date(2016,01,22,14,6,45);
    private Date endDate = new Date(2017,03,12,10,30,25);
    private Report testReport;

    @Before
    public void setUp() throws Exception {
        expenses = new ArrayList<Expense>();

        expenses.add(expense1);
        expenses.add(expense2);

        testReport.setEndDate(endDate);
        testReport.setStartDate(startDate);

        testReport = new Report();
        testReport.setExpenses(expenses);
    }
    @Test
    public void isEmpty() throws Exception {
        assertTrue(expenses.isEmpty());
    }

    @Test
    public void getExpenses() throws Exception {
        assertTrue(testReport.getExpenses() == expenses);
    }

    @Test
    public void setExpenses() throws Exception {
        testReport.setExpenses(expenses);
        assertTrue(testReport.getExpenses() != expenses);
    }

    @Test
    public void getStartDate() throws Exception {
        assertTrue(testReport.getStartDate() == startDate);
    }

    @Test
    public void setStartDate() throws Exception {
        testReport.setEndDate(startDate);
        assertTrue(testReport.getStartDate() != startDate);
    }

    @Test
    public void getEndDate() throws Exception {
        assertTrue(testReport.getEndDate() == endDate);
    }

    @Test
    public void setEndDate() throws Exception {
        testReport.setEndDate(endDate);
        assertTrue(testReport.getEndDate() != endDate);
    }

    @Test
    public void getTotalAmount() throws Exception {
        assertTrue(testReport.getTotalAmount().compareTo(BigDecimal.ZERO) <= 0);
    }

    @Test
    public void getTotalAmount1() throws Exception {
        assertTrue(testReport.getTotalAmount(startDate,endDate).compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    public void groupByCategory() throws Exception {
        Map<Category, Report> resultMap = testReport.groupByCategory();
        Category[] resultArray = (Category[]) resultMap.keySet().toArray();
        boolean result = true;
        for (int i = 1; i< resultArray.length; ++i)
            if (resultArray[i-1].getTitle().compareTo(resultArray[i].getTitle()) > 0)
                result = false;

        assertFalse(result);
    }


}