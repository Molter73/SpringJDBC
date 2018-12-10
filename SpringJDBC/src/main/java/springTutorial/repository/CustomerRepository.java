/**
 * 
 */
package springTutorial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import springTutorial.Customer;

/**
 * @author Molter
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}
