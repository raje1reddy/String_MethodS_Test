

public class StringMethodsTest {
    public static void main(String[] args) {
        String name = new String("padmaja");
        //method charAt(index) to retrieve a character at specified index of string
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(6));

        //method indexOf() to search a string for the occurence of a character or a string
        String letters = "ABCAB";
        System.out.println(letters.indexOf('B'));
        System.out.println(letters.indexOf("S"));
        System.out.println(letters.indexOf("CA"));
        System.out.println(letters.indexOf('B',2));


        //method SubString -returns the substring of a string from the position you specify to the end of the string
        String exam = "Oracle";
        String sub = exam.substring(2);
        System.out.println(sub);
        System.out.println(exam.substring(2,4));


        //trim method returns a new string by removing all the leading and trailing white spaces in a string
        //trim method does not remove a space with in a string
        String varWithSpaces = "AB CB     " ;
        System.out.println(":");
        System.out.println(varWithSpaces);
        System.out.println(":");
        System.out.println(varWithSpaces.trim());
        System.out.println(":");

        //replace() method returns a new string by replacting all the occurences of a char with new char
        String letter = "ABCAB";
        System.out.println(letter.replace('B', 'b'));
        System.out.println(letters.replace("BC","12"));
        System.out.println(letters);


        //length method used to retrieve the length of a string
        System.out.println("Padmaja".length());

        //startsWith()  method determines whether the string starts with specified prefix ,as specified in  a string
        System.out.println(letters.startsWith("AB"));
        System.out.println(letter.startsWith("a"));
        System.out.println(letter.startsWith("A",3));
        //endssWith()  method determines whether the string ends with specified prefix ,as specified in  a string
        System.out.println(letters.endsWith("CAB"));
        System.out.println(letter.endsWith("B"));
        System.out.println(letter.endsWith("b"));
    }
}




