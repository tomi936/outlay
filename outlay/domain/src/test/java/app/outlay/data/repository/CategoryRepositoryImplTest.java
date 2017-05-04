package app.outlay.data.repository;
import org.junit.Before;


import java.util.ArrayList;
import java.util.List;

import app.outlay.data.source.CategoryDataSource;
import app.outlay.domain.model.Category;
import app.outlay.domain.repository.CategoryRepository;
import rx.Observable;
import static org.mockito.Mockito.*;

/**
 * Created by László Tamás on 2017. 05. 04..
 */
public class CategoryRepositoryImplTest {

    private CategoryDataSource mockFS;
    private CategoryRepository CR;

    String id = "1";
    String title = "Test title";
    String icon = "ic_fuel";
    int order = 3;
    int color = -26624;

    Category cat1,cat2;

    @Before
    public void init() {
        cat1 = new Category();
        cat1.setId(id);
        cat1.setTitle(title);
        cat1.setIcon(icon);
        cat1.setOrder(order);
        cat1.setColor(color);


        mockFS = mock(CategoryDataSource.class);
        CR = new CategoryRepositoryImpl(mockFS);
    }


    @org.junit.Test
    public void getAll() throws Exception {
        Observable<List<Category>> retval = Observable.create(subscriber -> {
                            List<Category> categories = new ArrayList<>();
                            categories.add(cat1);
                            categories.add(cat2);
                            subscriber.onNext(categories);
                            subscriber.onCompleted();});
        when(mockFS.getAll()).thenReturn(retval);

        CR.getAll();
        verify(mockFS, times(1)).getAll();
    }

    @org.junit.Test
    public void getById() throws Exception {
        Observable<Category> val = mock(Observable.class);
        when(mockFS.getById("5")).thenReturn(val);
        CR.getById("5");
        verify(mockFS, times(1)).getById("5");
    }


    @org.junit.Test
    public void remove() throws Exception {
        CR.remove(cat1);
        verify(mockFS, times(1)).remove(cat1);
    }

}