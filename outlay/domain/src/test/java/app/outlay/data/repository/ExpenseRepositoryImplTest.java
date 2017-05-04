package app.outlay.data.repository;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import app.outlay.data.source.CategoryDataSource;
import app.outlay.data.source.ExpenseDataSource;
import app.outlay.domain.model.Category;
import app.outlay.domain.model.Expense;
import app.outlay.domain.repository.ExpenseRepository;
import rx.Observable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Lycan on 2017. 05. 04..
 */
public class ExpenseRepositoryImplTest {

    private ExpenseDataSource mockFS;
    private ExpenseRepository ER;

    private String id = "1";
    private String note = "Test note";
    private BigDecimal amount = BigDecimal.valueOf(10.0);
    private Date reportedWhen = new Date(2017,03,21,13,14,5);
    private Category category;

    private Expense exp;

    @Before
    public void setUp() throws Exception {
        category = new Category();
        category.setId("1");
        category.setTitle("Test Category");
        category.setIcon("ic_fuel");
        category.setOrder(1);
        category.setColor(-26624);
        exp = new Expense();
        exp.setId(id);
        exp.setNote(note);
        exp.setAmount(amount);
        exp.setCategory(category);
        exp.setReportedWhen(reportedWhen);

        mockFS = mock(ExpenseDataSource.class);
        ER = new ExpenseRepositoryImpl(mockFS);
    }

    @Test
    public void saveExpense() throws Exception {
        ER.saveExpense(exp);
        verify(mockFS, times(1)).saveExpense(exp);
    }

    @Test
    public void remove() throws Exception {
        ER.remove(exp);
        verify(mockFS, times(1)).remove(exp);
    }

    @Test
    public void findExpense() throws Exception {
        ER.findExpense(id,reportedWhen);
        verify(mockFS, times(1)).findExpense(id,reportedWhen);
    }

    @Test
    public void getExpenses() throws Exception {
        Date startDate = new Date(2016,01,22,14,6,45);
        Date endDate = new Date(2017,03,12,10,30,25);
        ER.getExpenses(startDate,endDate);
        verify(mockFS, atLeast(1)).getExpenses(startDate,endDate,null);
    }

    @Test
    public void getExpenses1() throws Exception {
        Date startDate = new Date(2016,01,22,14,6,45);
        Date endDate = new Date(2017,03,12,10,30,25);
        ER.getExpenses(startDate,endDate,"2");
        verify(mockFS, times(1)).getExpenses(startDate,endDate,"2");
    }

}