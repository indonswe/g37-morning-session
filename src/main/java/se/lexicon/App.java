package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    static String[] names  = new String[0];
    public static void main( String[] args )
    {
        //How i t could look like using the method for the assignment.
        //Have not implemented them of a purpose.


        String name = "Simon Elbrin";
        boolean wasAdded = add(name);
        update("Simon Elbrin", "Simon Elbrink");
        System.out.println("wasAdded = " + wasAdded);
        String name1 = "Adrian Nilsso";
        wasAdded = add(name1);
        update("Adrian Nilsso", "Adrian Nilsson");
        System.out.println("wasAdded = " + wasAdded);


        //CRUD - Create, Read, Update, Delete

    }

    public static boolean update(final String original, final String updatedName){

        int nl = names.length;
        //System.out.println("update: " + nl);
    for (int i = 0;i < names.length; i++)
    {
        //System.out.println("i: " + i);
        //System.out.println("names: " + names[i]);
        if (names[i].equals(original)) {
            System.out.println(names[i]);
            names[i] = updatedName;
            System.out.println(names[i]);
        }

    }

        return true;
    }
    public static boolean add(final String fullName){
        int nl = names.length+1;
        String [] newArray = new String[nl];

        newArray[nl-1] = fullName;
        for (int i = 0;i < names.length; i++)
        {

            newArray[i] = names[i];

        }
        newArray[nl-1] = fullName;
        names = newArray;


        return true;
    }
}
