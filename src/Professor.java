/**
 * Simple Professor abstraction.
 */
public class Professor {
    private final int professorId;
    private final String professorName;
    private int[] timePreference;
    /**
     * Initalize new Professor
     *
     * @param professorId   The ID for this professor
     * @param professorName The name of this professor
     */
    public Professor(int professorId, String professorName,
                     int[] timePreference) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.timePreference = timePreference;
    }

    public int[] getTimePreference(){
        return this.timePreference;
    }
    /**
     * Get professorId
     *
     * @return professorId
     */
    public int getProfessorId() {
        return this.professorId;
    }

    /**
     * Get professor's name
     *
     * @return professorName
     */
    public String getProfessorName() {
        return this.professorName;
    }
}
