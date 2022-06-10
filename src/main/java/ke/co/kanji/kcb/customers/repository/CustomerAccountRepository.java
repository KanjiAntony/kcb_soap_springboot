package ke.co.kanji.kcb.customers.repository;

import ke.co.kanji.kcb.customers.entity.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount,Long> {
}
