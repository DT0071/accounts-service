package com.dtcodes.accounts.repository;

import com.dtcodes.accounts.entity.Account;
import com.dtcodes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
