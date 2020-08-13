package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jantonio on 13/08/2020.
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
