public class Course {
    private String nomination;
    private String dateOfCreate;
    private int ID;
    private String FIO;

    @Override
    public String toString() {
        return  "Course " +
                "nomination: " + nomination + "\n" +
                "dateOfCreate: " + dateOfCreate + "\n" +
                "ID: " + ID + "\n"+
                "FIO: " + FIO ;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}
