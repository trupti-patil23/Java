package serialization.deserialization;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class SuryaNamaskar implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<String> steps = null;
	private String difficultyLevel = null;

	public SuryaNamaskar() {
		super();
		this.steps = getSteps();
		this.difficultyLevel = getDifficultyLevel();
	}

	public String getDifficultyLevel() {
		return "Easy";
	}

	private List<String> getSteps() {

		// Create SuryaNamaskar object
		steps = new ArrayList<>();
		steps.add("Pranamasana (Prayer Pose)");
		steps.add("Hastauttanasana (Raised Arms Pose)");
		steps.add("Padahastasana (Hand to Foot Pose)");
		steps.add("Ashwa Sanchalanasana (Equestrian Pose)");
		steps.add("Dandasana (Stick Pose)");
		steps.add("Ashtanga Namaskara (Salute with Eight Parts)");
		steps.add("Bhujangasana (Cobra Pose)");
		steps.add("Adho Mukha Svanasana (Downward Dog Pose)");
		steps.add("Ashwa Sanchalanasana (Equestrian Pose)");
		steps.add("Padahastasana (Hand to Foot Pose)");
		steps.add("Hastauttanasana (Raised Arms Pose)");
		steps.add("Pranamasana (Prayer Pose)");
		return steps;
	}
	
	@Override
	public String toString() {
		return "SuryaNamaskar [steps=" + steps + ", difficultyLevel=" + difficultyLevel + "]";
	}
}
