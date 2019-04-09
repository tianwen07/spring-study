package cn.edu.zut.business;

import cn.edu.zut.DAO.BookDAO;
import cn.edu.zut.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by irene on 2019/3/25.
 */
@Service
public class SaleService {

    StudentDAO StudentDAO;
    public void onSale(float sale) {
        List<Student> books = bookDAO.queryAll();
        for(Book b : books) {
            b.setPrice(b.getPrice()*sale);
            System.out.println(b.getPrice());
            bookDAO.modifyBook(b);

        }
    }

    public void insertBook(Book book) {
        bookDAO.insertBook(book);
    }

    @Autowired
    @Qualifier(value = "bdi1")
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
}
