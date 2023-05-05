public class CategoryEnum {

    // This program is for showing how ENUM is used.
    // Category ENUM is created to indicate whether men, women, kid, grandma, and grandpa
    // Each category has its own corresponding value and the corresponding value is printed once program is ran.

    public static void main(String[] args) {
        Category category = Category.GRANDMA;

        switch (category){
            case MEN:
                System.out.println(category + " " + 13.57); break;
            case WOMEN:
                System.out.println(category + " " + 20.45); break;
            case KID:
                System.out.println(category + " " + 45.6); break;
            case GRANDMA:
                System.out.println(category + " " + 56.67); break;
            case GRANDPA:
                System.out.println(category + " " + 3.56); break;
            default:
                System.out.println("No category chosen... exiting program");
        }
    }

    public enum Category {
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }
}
