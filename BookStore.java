
/**
 * ASSIGNMENT 3, CLASS BOOKSTORE
 * 
 * @author Bibiana Souza A01017514
 * @version 1
 */
public class BookStore {
    private String storeName;
    private Book[] inventory;

    // constants
    private static final String EQUAL_TAYLOR_BOOKS = "Taylor's Used Books";
    private static final String JASON_BOOKS = "Jason's Used Books";

    /**
     * Constructor with no params
     */
    public BookStore() {
        createArray();
    }

    /**
     * Constructor with storeName param
     * 
     * @param storeName sets the store name with the input provided
     */
    public BookStore(String storeName) {
        createArray();
        setStoreName(storeName);
    }

    ////////////////////////////////////////////////////////
    //////////////////// ACCESSOR METHODS////////////////////
    ////////////////////////////////////////////////////////
    public String getStoreName() {
        return storeName;
    }

    public Book[] getInventory() {
        return inventory;
    }

    ////////////////////////////////////////////////////////
    //////////////////// MODIFIER METHODS////////////////////
    ////////////////////////////////////////////////////////
    public void setStoreName(String storeName) {
        if ((storeName != null) && (storeName != EQUAL_TAYLOR_BOOKS)) {
            this.storeName = storeName;
        } else {
            this.storeName = JASON_BOOKS;
        }
    }

    public void setInventory() {
        inventory = new Book[20];
    }

    /**
     * this method creates the array of book objects and assign it to the inventory
     * array
     */
    private void createArray() {
        inventory = new Book[20];
        inventory[0] = new Book(
                new Author(new Name("James", "Joyce", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Ulysses");
        inventory[1] = new Book(
                new Author(new Name("F.", "Fitzgerald", "Scott"),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "The Great Gatsby");
        inventory[2] = new Book(
                new Author(new Name("James", "Joyce", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "A Portrait Of The Artist As A Young Man");
        inventory[3] = new Book(new Author(new Name("Vladimir", "Nabokov", null),
                new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()), new Date(), "LOLITA");
        inventory[4] = new Book(
                new Author(new Name("Aldous", "Huxley", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Brave New World");
        inventory[5] = new Book(
                new Author(new Name("William", "Faulkner", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "The Sound and the Fury");
        inventory[6] = new Book(
                new Author(new Name("Joseph", "Heller", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Catch-22");
        inventory[7] = new Book(
                new Author(new Name("Arthur", "Koestler", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Darkness at Noon");
        inventory[8] = new Book(
                new Author(new Name("D.", "Lawrence", "H."),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Sons and Lovers");
        inventory[9] = new Book(
                new Author(new Name("John", "Steinbeck", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "The Grapes of Wrath");
        inventory[10] = new Book(
                new Author(new Name("Malcolm", "Lowry", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Under the Volcano");
        inventory[11] = new Book(
                new Author(new Name("Samuel", "Butler", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "The Way of all Flesh");
        inventory[12] = new Book(new Author(new Name("George", "Orwell", null),
                new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()), new Date(), "1984");
        inventory[13] = new Book(
                new Author(new Name("Robert", "Graves", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "I, Claudius");
        inventory[14] = new Book(
                new Author(new Name("Virginia", "Woolf", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "To the Lighthouse");
        inventory[15] = new Book(
                new Author(new Name("Theodore", "Dreiser", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "An American Tragedy");
        inventory[16] = new Book(
                new Author(new Name("Carson", "McCullers", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "The Heart is A Lonely Hunter");
        inventory[17] = new Book(
                new Author(new Name("Kurt", "Vonnegut", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Slaughterhouse-Five");
        inventory[18] = new Book(
                new Author(new Name("George", "Orwell", null),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "ANIMAL FARM");
        inventory[19] = new Book(
                new Author(new Name("W.", "Maugham", "Somerset"),
                        new Date(Date.DEFAULT_YEAR, Date.JANUARY, Date.DEFAULT_DAY), new Date()),
                new Date(), "Of Human Bondage");
    }

    //////////////////////////////////////////////////////////////////////////////
    /////////////////////////// OTHER METHODS//////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////
    /**
     * @param authorLastName parameter that takes the author's name and will search
     *                       in the array
     */
    public int howManyBooksDidThisAuthorWrite(String authorLastName) {
        int books = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getAuthor().getName().getLastName().equalsIgnoreCase(authorLastName)) {
                books++;
            }
        }
        return books;
    }

    /**
     * @param title takes the title to be matched within the array, returns author's
     *              full name
     */
    public String getAuthorFullName(String title) {
        for (int i = 0; i < inventory.length; i++) {
            if ((inventory[i].getTitle() != null) && inventory[i].getTitle().equalsIgnoreCase(title)) {
                if (inventory[i].getAuthor().getName().getMiddleName() == null) {
                    return inventory[i].getAuthor().getName().getFirstName() + " "
                            + inventory[i].getAuthor().getName().getLastName();
                } else {
                    return inventory[i].getAuthor().getName().getFirstName() + " "
                            + inventory[i].getAuthor().getName().getMiddleName() + " "
                            + inventory[i].getAuthor().getName().getLastName();
                }
            }
        }
        return null;
    }

    /**
     * @return booksWrittenBy returns the books written by the author's last name
     */
    public Book[] getBooksWrittenBy(String authorLastName) {
        int authorFound = 0;

        if ((inventory == null) || (inventory.length == 0)) {
            return null;
        }

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getAuthor().getName().getLastName().equalsIgnoreCase(authorLastName)) {
                authorFound++;
            }
        }

        if (authorFound == 0) {
            return null;
        }

        Book[] booksWrittenBy = new Book[authorFound];

        int indexNewArray = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getAuthor().getName().getLastName().equalsIgnoreCase(authorLastName)) {
                booksWrittenBy[indexNewArray] = inventory[i];
                indexNewArray++;
            }
        }
        return booksWrittenBy;
    }

    /**
     * @return inventory returns an array of books if found any by the author's
     *         first name, otherwise returns null
     */
    public Book getBookWrittenBy(String firstName) {
        if ((inventory == null) || (inventory.length == 0)) {
            return null;
        }

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getAuthor().getName().getFirstName().equalsIgnoreCase(firstName)) {
                return inventory[i];
            }
        }
        return null;
    }

    /**
     * @return bookTitles returns all the titles that contain the specified search
     */
    public String[] getBookTitlesContaining(String wordInTitle) {
        int booksFound = 0;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getTitle().toLowerCase().contains(wordInTitle.toLowerCase())) {
                booksFound++;
            }
        }

        String[] bookTitles = new String[booksFound];
        int index = 0;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getTitle().toLowerCase().contains(wordInTitle.toLowerCase())) {
                bookTitles[index] = inventory[i].getTitle();
                index++;
            }
        }
        return bookTitles;
    }
}
