package designpattern.structural.adapter;

public class LanguageAdapter implements Language {

	private Object buddy; // Could be either FrenchBuddy or EnglishBuddy

	public LanguageAdapter(Object buddy) {
		this.buddy = buddy;
	}

	@Override
	public void communicate(String message) {
		if (buddy instanceof FrenchBuddy) {
			System.out.println("Translating to French...");
			((FrenchBuddy) buddy).speak(translateToFrench(message));

		} else if (buddy instanceof EnglishBuddy) {
			System.out.println("Translating to English...");
			((EnglishBuddy) buddy).speak(translateToEnglish(message));
		}

	}

	private String translateToFrench(String message) {
		if ("Hello".equalsIgnoreCase(message))
			return "Bonjour";
		return "Traduction indisponible";
	}

	private String translateToEnglish(String message) {
		if ("Bonjour".equalsIgnoreCase(message))
			return "Hello";
		return "Translation unavailable";
	}

}
