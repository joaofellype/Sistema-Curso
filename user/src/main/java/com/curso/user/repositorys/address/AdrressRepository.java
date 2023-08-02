package com.curso.user.repositorys.address;

import com.curso.user.models.addrees.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdrressRepository extends JpaRepository<Long, Address> {
}
