package cn.edu.zut.business;

import cn.edu.zut.DAO.StudentDAO;
import cn.edu.zut.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by irene on 2019/3/25.
 */
@Service
public class Get {

     StudentDAO StudentDAO;
    public void Get(float get) {
        List<Student> Students = StudentDAO.queryAll();
        for(Student b : Students) {
            b.setGrade(b.getGrade()*sale);
            System.out.println(b.getPrice());
            StudentDAO.modifyBook(b);

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
