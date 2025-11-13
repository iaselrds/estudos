//AULA 120 - Enumerações

package section12;

import java.time.Instant;

import POO.entities.enums.OrderStatus;
import POO.entities.processes.Order;

public class Lesson120 {
	
	public static void main(String[] args) {
		Order order = new Order(1800, Instant.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.PROCESSING;
		OrderStatus os2 = OrderStatus.valueOf("SHIPPED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
