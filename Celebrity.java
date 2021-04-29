
public class Celebrity {
    
    private String celebrity;
    private String description;

    public Celebrity(String inputCelebrity, String inputDescription) {
        celebrity = inputCelebrity;
        description = inputDescription;
    }

    public String getCelebrity() {
        return celebrity;
    }
    public String getDescription() {
        return description;
    }

    public void setCelebrity(String inputCelebrity) {
        celebrity = inputCelebrity;
    }
    public void setDescription(String inputDescription) {
        description = inputDescription;
    }
    public String toString() {
        return celebrity + ": " + description;
    }



}