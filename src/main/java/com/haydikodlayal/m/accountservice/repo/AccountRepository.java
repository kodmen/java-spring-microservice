package com.haydikodlayal.m.accountservice.repo;

import com.haydikodlayal.m.accountservice.entitiy.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CassandraRepository<Account, String > {

}
