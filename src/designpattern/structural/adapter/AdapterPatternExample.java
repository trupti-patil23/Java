package designpattern.structural.adapter;

public class AdapterPatternExample {

	public static void main(String[] args) {
		// French Buddy
		FrenchBuddy frenchBuddy = new FrenchBuddy();
		// Adapter for French Buddy
		Language frenchAdapter = new LanguageAdapter(frenchBuddy);

		// English Buddy
		EnglishBuddy englishBuddy = new EnglishBuddy();
		 // Adapter for English Buddy
        Language englishAdapter = new LanguageAdapter(englishBuddy);
        
        // Communication
        System.out.println("English Buddy speaks to French Buddy:");
        frenchAdapter.communicate("Hello");

        System.out.println("\nFrench Buddy speaks to English Buddy:");
        englishAdapter.communicate("Bonjour");

	}

}
