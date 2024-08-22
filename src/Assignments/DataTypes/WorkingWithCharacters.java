package Answers.DataTypes;

public class WorkingWithCharacters {
    public static void main(String[] args) {
        char letter = 'E';
        boolean Uppercase = Character.isUpperCase(letter);
        System.out.println(Uppercase);

        // OR

        System.out.println(Character.isUpperCase(letter));

    }
}
