package serialization.deserialization;

import java.io.Serializable;

public class Yoga implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String importance;
	transient private String difficultyLevel; //It's state should not be saved
	private SuryaNamaskar suryaNamaskar; // Reference to SuryaNamaskar
	
	public Yoga(String name, String importance, String difficultyLevel, SuryaNamaskar suryaNamaskar) {
		super();
		this.name = name;
		this.importance = importance;
		this.difficultyLevel = difficultyLevel;
		this.suryaNamaskar = suryaNamaskar;
	}

	public String getName() {
		return name;
	}

	public String getImportance() {
		return importance;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public SuryaNamaskar getSuryaNamaskar() {
		return suryaNamaskar;
	}

	@Override
	public String toString() {
		return "Yoga [name=" + name + ", importance=" + importance + ", difficultyLevel=" + difficultyLevel
				+ ", suryaNamaskar=" + suryaNamaskar + "]";
	}	

}
