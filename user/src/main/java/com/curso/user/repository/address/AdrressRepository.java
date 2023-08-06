package com.curso.user.repository.address;

import com.curso.user.models.addrees.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdrressRepository extends JpaRepository<Address,Long> {
}
