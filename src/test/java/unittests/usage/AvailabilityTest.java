package unittests.usage;



import com.mycompany.data.Car;
import com.mycompany.usage.UserMethods;
import java.util.ArrayList;

import java.util.List;
import org.junit.Before;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TAURAS
 */
public class AvailabilityTest {

    private List<Car> list;
    private UserMethods methods;
    
    @Before
	public void init() {
		list = new ArrayList<>();

		methods = new UserMethods(){

			@Override
			public List<Car> setRezervation(int ID) {
				return list;
			}

			@Override
			public Book getByISBN(String codeISBN) {
				throw new RuntimeException();
			}

			@Override
			public List<Book> getAllBooks() {
				throw new RuntimeException();
			}
		};

		library = new Library(resource);

	}
    
}
