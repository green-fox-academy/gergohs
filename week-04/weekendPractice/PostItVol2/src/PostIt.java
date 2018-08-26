class PostIt {
    private String backgroundColor;
    private String textOnit;
    private String textColor;

    PostIt(String backgroundColor, String textOnit, String color) {
        this.backgroundColor = backgroundColor;
        this.textOnit = textOnit;
        this.textColor = color;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}


