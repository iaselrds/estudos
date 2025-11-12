package section11;

import java.time.ZoneId;

public class Zones {
	public static void main(String[] args) {
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
	}
}
