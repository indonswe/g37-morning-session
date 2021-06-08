package se.lexicon;

public class StringManipulation {

    public static void main(String[] args) {

        // By convention objects starts with UPPERCASE. Ex. String, Car, Person etc.

        // Create String as primitive
        String object = "Hello this is a message";

        //Create String as a Object
        String string1 = new String();

        //Could create without saving it?
        "StringText".toString();




        //Primitives does not have any methods.
        int integerValue = 123;
        //integerValue.?;

        //Objects have methods, like this one and many more.
        object.toString();


        //---------------------- String Methods ---------------------

        // String.length
        System.out.println("object.length() = " + object.length()); //23

        // String.charAt
        System.out.println("object.charAt(7) = " + object.charAt(7)); // h
        
        /*
        indexOf - will always look for the first match.
        Could have char or characters as parameter.
        Because char is actually a number in Unicode you could also write char as number.
         */

        System.out.println("object.indexOf('H') = " + object.indexOf('H')); //0

        System.out.println("object.indexOf(0x48) = " + object.indexOf(0x48)); //0


        System.out.println("object.indexOf(\"this\") starts at index: " + object.indexOf("this")); //6

        int indexOf_e_AfterIndexFive = object.indexOf('e', 2);

        System.out.println("indexOf_e_AfterIndexFive = " + indexOf_e_AfterIndexFive);

        int lastIndexOf_e = object.lastIndexOf('e');
        System.out.println("lastIndexOf_e = " + lastIndexOf_e);



        object.substring(4, 5);

        String find = "this";
        int startIndex = object.indexOf(find);

        String newMessage = object.substring(startIndex, startIndex + find.length());

        System.out.println("newMessage = " + newMessage);


        String unstructuredMessage = "h3lLo-mY NaM3_is S1Mon";
        System.out.println("Original message: " + unstructuredMessage);

        System.out.println("unstructuredMessage.toLowerCase() = " + unstructuredMessage.toLowerCase());
        System.out.println("unstructuredMessage.toUpperCase() = " + unstructuredMessage.toUpperCase());


        //Equals

        String stringValue = "Hello World";
        String stringValue2 = "heLLo woRLD";

        boolean isEqual = stringValue.equals(stringValue2); // false
        boolean isEqualNow = stringValue.equalsIgnoreCase(stringValue2); // true

        System.out.println("isEqual = " + isEqual);
        System.out.println("isEqualNow = " + isEqualNow);


        // StartsWith, endsWith, contains


        String evaluate = "Hello this is a message!";

        evaluate.startsWith("hello"); //false

        evaluate.endsWith("!"); //True

        evaluate.contains("Is"); //false


        String text = "abracadabra";

        System.out.println(text.replaceFirst("a","A"));

        System.out.println(text.replace("a", "A"));
        System.out.println(text.replaceAll("a", "A"));

        System.out.println(text.replace("abra", "dabra"));


        // String.Trim


        System.out.println("   \n \t       hello\tworld      \t \n");
        System.out.println("   \n \t       hello\tworld      \t \n".trim());

    }
}
