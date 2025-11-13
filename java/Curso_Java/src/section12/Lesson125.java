package section12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import POO.entities.items.Comment;
import POO.entities.items.Post;

public class Lesson125 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow! That's awesome!");
		Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", fmt), 
				"Travelling to New Zealand", 
				"Visiting this wonderful country!", 
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
