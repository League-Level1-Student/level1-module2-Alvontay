package _99_extra._04_tea_party;

public class TeaParty {
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	
    	String title;
    	
		if (isKnighted) {
			if (isWoman) {
				title = "Lady";
			} else {
				title = "Sir";
			}
		} else {
			if (isWoman) {
				title = "Ms.";
			} else {
				title = "Mr.";
			}
		}
		
		return "Hello " + title + " " + name;
		

        
    }
}
