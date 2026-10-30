public class Food {
    private String name;
    private String category;
    private int calories;
    private static int totalCal = 0;
    private boolean stillEdible = true;

    public Food() {
        this("Apple", "fruit", 95);//default
    }

    public Food(String name, String category, int calories) {//paramaterized
    	if (name == null || name.trim().isEmpty()) {
            System.out.println("Can't be this name");
            return;
        }
    	this.name = name;
        this.category = category;
        this.calories = calories;
        totalCal += calories;
    }
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getCalories() {
        return calories;
    }

    public void setName(String newName) {
        name = newName;
    }
    
    public void setCal(int newCals) {
    	 if (newCals < 0) {
    	        System.out.println("Invalid calories!");
    	        return;
    	    }
        totalCal += newCals - calories;
        calories = newCals;
    }
    
    public void foodBad(boolean foodwentbad) {
    	if (!stillEdible) {
            System.out.println("Food is already spoiled");
            return;
        }
    	stillEdible = foodwentbad;
    	totalCal=-calories;
    }

    public void printState() {
        System.out.printf("Name: " + name + ", Category: " + category + "Calories: " + calories);
        
    
    }
}
