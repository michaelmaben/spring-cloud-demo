package com.jeevanmaben.paymentserviceapi;

import com.jeevanmaben.paymentserviceapi.domain.Payment;
import com.jeevanmaben.paymentserviceapi.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.BDDAssertions.*;

@DataJpaTest
@RequiredArgsConstructor
class PaymentServiceApiApplicationTests {

	@Autowired
	private PaymentRepository paymentRepository;

	@Test
	void getPayment(){
		//given
		Payment savedPayment = paymentRepository.save(new Payment(1l,1526.0, "success"));
		//when
		Payment payment = paymentRepository.getPaymentById(savedPayment.getId());
		//then
		then(payment.getId()).isEqualTo(savedPayment.getId());
	}

}
