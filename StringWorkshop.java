public class StringWorkshop {
    public static void main(String[] args) {
        String fristName = "Anna";
        String lastName = "Andersson";
        String fullName = fristName + " " + lastName;
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println("Hej! Jag heter " + fullName + ".");
        System.out.println("Mitt namn innegåller " + fullName.length() + " tecken.");
        System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession + ".");
    }
}
