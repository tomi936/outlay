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
        testReport = new Report();

        expenses.add(expense1);
        expense1.setAmount(BigDecimal.valueOf(1000));
        expenses.add(expense2);
        expense2.setAmount(BigDecimal.valueOf(1000));

        testReport.setEndDate(endDate);
        testReport.setStartDate(startDate);
        testReport.setExpenses(expenses);
    }
    @Test
    public void isEmpty() throws Exception {
        assertEquals(false, expenses.isEmpty());
    }

    @Test
    public void getExpenses() throws Exception {
        assertEquals(true, testReport.getExpenses() == expenses);
    }

    @Test
    public void setExpenses() throws Exception {
        testReport.setExpenses(expenses);
        assertEquals(true, testReport.getExpenses() == expenses);
    }

    @Test
    public void getStartDate() throws Exception {
        assertEquals(true, testReport.getStartDate().equals(startDate));
    }

    @Test
    public void setStartDate() throws Exception {
        testReport.setStartDate(startDate);
        assertEquals(true, testReport.getStartDate().equals(startDate));
    }

    @Test
    public void getEndDate() throws Exception {
        assertEquals(true, testReport.getEndDate().equals(endDate));
    }

    @Test
    public void setEndDate() throws Exception {
        testReport.setEndDate(endDate);
        assertEquals(true, testReport.getEndDate().equals(endDate));
    }

    @Test
    public void getTotalAmount() throws Exception {
        assertEquals(true, testReport.getTotalAmount().compareTo(BigDecimal.ZERO) >= 0);
    }

    @Test
    public void getTotalAmount1() throws Exception {
        assertEquals(true, testReport.getTotalAmount(startDate,endDate).compareTo(BigDecimal.ZERO) >= 0);
    }

    @Test
    public void groupByCategory() throws Exception {
        Map<Category, Report> resultMap = testReport.groupByCategory();
        Object[] resultArray = resultMap.keySet().toArray();
        boolean result = true;
        for (int i = 1; i< resultArray.length; ++i) {
            Category temp1 = (Category) resultArray[i-1];
            Category temp2 = (Category) resultArray[i];
            if (temp1.getTitle().compareTo(temp2.getTitle()) > 0)
                result = false;
        }
        assertEquals(true, result);
    }


}