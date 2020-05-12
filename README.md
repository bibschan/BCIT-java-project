# Final Java Assignment @ BCIT

This project's objective was to create a Bookstore that could store Books / Authors / Dates and a Car Dealership that could store information about Lamborghinis, such as Model Name, Horsepower and Year Manufactured.

The two main classes are listed below.

## Bookstore

The BookStore class creates an array of 20 Book objects, which therefore contain 2 additional objects each, an Author object and a Date object. A key method in this class is

`getBookTitlesContaining(String wordInTitle)` -> lets the user search for a book by using any keyword in its title. Two `for` loops were used for this method, iterating through the inventory array once and returning a second array with the books found containing the keyword. 

## Lamborghini Car Lot

The LamborghiniCarLot class adds Lamborghini objects to an inventory ArrayList, setting the year, name and horsepower. A few key methods in this class are

`getAverageHorsepowerOfYear(int modelYear)` -> iterates through all objects and stores the horsepower for each object that matches the `modelYear` parameter, and then calculates the average and returns.

`hasCarModel(String modelName)` -> iterates through the ArrayList with a `foreach` loop and compares each car's model with the input parameter (ignoring case letters). Returns true if a match is found and false if not.

