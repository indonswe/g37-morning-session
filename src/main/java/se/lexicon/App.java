package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //How i t could look like using the method for the assignment.
        //Have not implemented them of a purpose.

        String name = "Simon Elbrin";
        boolean wasAdded = add(name);

        update("Simon Elbrin", "Simon Elbrink");

        System.out.println("wasAdded = " + wasAdded);

        //CRUD - Create, Read, Update, Delete

    }

    public static boolean update(final String original, final String updatedName){
        return true;
    }


    public static boolean add(final String fullName){


        return true;
    }
}
