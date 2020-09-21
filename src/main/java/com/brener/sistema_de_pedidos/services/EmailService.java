package com.brener.sistema_de_pedidos.services;

import org.springframework.mail.SimpleMailMessage;

import com.brener.sistema_de_pedidos.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
