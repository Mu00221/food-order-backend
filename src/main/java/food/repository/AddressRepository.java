package food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
