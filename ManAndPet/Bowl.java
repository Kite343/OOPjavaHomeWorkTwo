package ManAndPet;

public class Bowl {
    private boolean fill;
    private boolean clean;

    public Bowl(){
        this.fill = false;
        this.clean = false;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public boolean getFill(){
        return fill;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean getClean(){
        return clean;
    }

    @Override
    public String toString() {
        return "миска: " + (clean? "чистая" : "грязная") + " и " + (fill? "полная" : "пустая");
    }

    

}
