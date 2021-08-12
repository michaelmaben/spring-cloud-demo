package com.jeevanmaben.paymentserviceapi;

import com.jeevanmaben.paymentserviceapi.domain.Payment;
import com.jeevanmaben.paymentserviceapi.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.BDDAssertions.then;

@DataJpaTest
@RequiredArgsConstructor
class PaymentServiceApiRepositoryTests {

	@Autowired
	private PaymentRepository paymentRepository;

	@Test
	void getPaymentByIdTest(){
		//given
		Payment savedPayment = paymentRepository.save(new Payment(1l,1526.0, "success", 1l));
		//when
		Payment payment = paymentRepository.getPaymentById(savedPayment.getId());
		//then
		then(payment).isEqualTo(savedPayment);
	}

}
