package BankingApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAllCustomersDetailsAreCorrect(){
        Customer customer1= new Customer("Titus","damilola","Titi","lagos","290030","T@y.com");
        customer.setFirstName("billy");
        assertEquals("billy", customer.getFirstName());

        customer.setLastName("audu");
        assertEquals("audu", customer.getLastName());

        customer.setOtherNames("adams");
        assertEquals("adams", customer.getOtherNames());

        customer.setAddress("semicolon, yaba, Lagos");
        assertEquals("semicolon, yaba, Lagos", customer.getAddress());

        customer.setPhoneNumber("09056790444");
        assertEquals("09056790444", customer.getPhoneNumber());

        customer.setEmail("billyaudu@gmail.com");
        assertEquals("billyaudu@gmail.com", customer.getEmail());
        System.out.println(customer.toString());
        System.out.println();

    }
}