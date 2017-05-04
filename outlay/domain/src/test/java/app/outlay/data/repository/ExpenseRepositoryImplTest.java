package app.outlay.data.repository;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import app.outlay.data.source.ExpenseDataSource;
import app.outlay.domain.model.Category;
import app.outlay.domain.model.Expense;
import rx.Observable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Lycan on 2017. 05. 04..
 */
public class ExpenseRepositoryImplTest {

    private Category testCategory;
    private ExpenseRepositoryImpl test;

    private Date testDate;

    @Before
    public void setUp() throws Exception {

        /*testCategory.setId("1");
        testCategory.setTitle("asd");
        testCategory.setOrder(200);
        testCategory.setIcon("asd");
        testCategory.setColor(2);*/
    }

    @Test
    public void saveExpense() throws Exception {

    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void findExpense() throws Exception {

    }

    @Test
    public void getExpenses() throws Exception {

    }

    @Test
    public void getExpenses1() throws Exception {

    }

}