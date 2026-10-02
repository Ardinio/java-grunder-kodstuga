public class PersonCard {
    public static void main(String[] args) {
        String firstName = "Lisa";
        String lastName = "Andersson";
        int age = 28;
        double height = 1.72;
        char grade = 'B';
        boolean likesJava = true;
        
        System.out.println("Namn: " + firstName + " " + lastName);
        System.out.println("Ålder: " + age);
        System.out.println("Längd: " + height);
        System.out.println("Betyg: " + grade);
        System.out.println("Gillar Java: " + likesJava);

        int ageNextYear = age + 1;

        System.out.println("Nästa år är " + firstName + " "+ ageNextYear + " år.");

    }
}
