public class Plant {
    private String name;
    private String latName;
    private boolean perennial;
    private String continent;
    private int maxHeight;
    private boolean isEdible;

    public Plant() {
    }

    public Plant(String name, String latName, boolean perennial, String continent, int maxHeight, boolean isEdible) {
        this.name = name;
        this.latName = latName;
        this.perennial = perennial;
        this.continent = continent;
        this.maxHeight = maxHeight;
        this.isEdible = isEdible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public boolean getPerennial() {
        return perennial;
    }

    public void setPerennial(boolean perennial) {
        this.perennial = perennial;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public boolean getIsEdible() {
        return isEdible;
    }

    public void setIsEdible(boolean isEdible) {
        this.isEdible = isEdible;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", latName=" + latName + '\'' +
                ", perennial=" + perennial + '\'' +
                ", continent=" + continent + '\'' +
                ", max Height=" + maxHeight + '\'' +
                ", is Edible=" + isEdible + '\'' +
                '}';
    }
}
